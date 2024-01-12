package Service;

import domain.Student;
import domain.Subject;

import java.util.List;
import java.util.Scanner;

public class SaveStudentInform {


    Scanner sc = new Scanner(System.in);
    ScreenService screenService = new ScreenService();

    public void saveStudentInform() {
        // 1.수강생 정보 입력하기
        screenService.inputStudentIdNumber();
        String studentId = sc.nextLine();
        screenService.inputStudentName();
        String studentName = sc.nextLine();


        Student student = new Student(studentId, studentName);
        student.addToStudentCard();

        // 2.수강생 과목 입력하기
        Subject subjectE = new Subject(studentId, "");
        // 이 객체가 while문 안에있을 경우, 새로운 객체가 계속 생성되기 때문에 while문 밖에 있어야 한다.
        // 필수 과목 선택  (3개 미만까지는 계속 while문)
        while (true) {
            screenService.selectSubjectE();
            System.out.println("1." + common.enumeration.Subject.JAVA);
            System.out.println("2." + common.enumeration.Subject.OOP);
            System.out.println("3." + common.enumeration.Subject.SPRING);
            System.out.println("4." + common.enumeration.Subject.JPA);
            System.out.println("5." + common.enumeration.Subject.MYSQL);


            String subjectName = sc.nextLine();
            subjectE.makeEssentialSubjectList(studentId, subjectName);

            List<String> selectedEssentialSubjects = subjectE.getEessentialSubjectList(studentId);
            if (selectedEssentialSubjects.size() >= 3) {
                screenService.askKeepOrStop();
                String keepOrStop = sc.nextLine();
                if (keepOrStop.equals("2")) {
                    break;
                }
            }
        }
        // 선택과목 선택
        Subject subjectO = new Subject(studentId, "");
        while (true) {
            screenService.selectSubjectO();
            System.out.println("1." + common.enumeration.Subject.DESIGNPATTERN);
            System.out.println("2." + common.enumeration.Subject.SPRINGSEQURITY);
            System.out.println("3." + common.enumeration.Subject.REDIS);
            System.out.println("4." + common.enumeration.Subject.MONGODB);

            String subjectName = sc.nextLine();
            subjectO.makeOptionalSubjectList(studentId, subjectName);

            List<String> selectedOptionalSubjects = subjectO.getOptionalSubjectList(studentId);
            if (selectedOptionalSubjects.size() >= 2) {
                screenService.askKeepOrStop();
                String keepOrStop = sc.nextLine();
                if (keepOrStop.equals("2")) {
                    break;
                }
            }
        }

    }
}
