package Service;

import common.enumeration.SubjectType;
import domain.Student;
import store.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentAppender {
    Scanner sc = new Scanner(System.in);
    ScreenService screenService = new ScreenService();

    Integer ID = 0;

    public void append() {
        screenService.inputStudentIdNumber();
        Integer studentId = Integer.parseInt(sc.nextLine());
        Integer ID = studentId;
        screenService.inputStudentName();
        String studentName = sc.nextLine();
        List<SubjectType> essentialSubjects = addEssentialSubjects();
        List<SubjectType> optionalSubjects = addOptionalSubjects();
        Student student = new Student(
                studentId,
                studentName,
                essentialSubjects,
                optionalSubjects
        );
        Store.addStudent(student);
    }
    private List<SubjectType> addEssentialSubjects() {
        List<SubjectType> essentialSubjects = new ArrayList<>();
        while (true) {
            screenService.selectSubjectE();
            System.out.println("1." + SubjectType.JAVA);
            System.out.println("2." + SubjectType.OOP);
            System.out.println("3." + SubjectType.SPRING);
            System.out.println("4." + SubjectType.JPA);
            System.out.println("5." + SubjectType.MYSQL);

            String subjectName = sc.nextLine();
            for (SubjectType subjectType : SubjectType.values()) {
                if (!subjectType.name().equalsIgnoreCase(subjectName)) {
                    continue;
                }
                if (essentialSubjects.contains(subjectType)) {
                    System.out.println("이미 선택된 과목입니다. 다른 과목을 선택해주세요.");
                } else essentialSubjects.add(subjectType);
            }


            if (essentialSubjects.size() >= 3) {
                screenService.askKeepOrStop();
                String keepOrStop1 = sc.nextLine();
                if (keepOrStop1.equals("2")) {
                    break;
                }
            }
        }
        return essentialSubjects;
    }

    private List<SubjectType> addOptionalSubjects() {
        List<SubjectType> optionalSubjects = new ArrayList<>();
        while (true) {
            screenService.selectSubjectO();
            System.out.println("1." + SubjectType.DESIGNPATTERN);
            System.out.println("2." + SubjectType.SPRINGSEQURITY);
            System.out.println("3." + SubjectType.REDIS);
            System.out.println("4." + SubjectType.MONGODB);
            String subjectName = sc.nextLine();
            for (SubjectType subjectType : SubjectType.values()) {
                if (!subjectType.name().equalsIgnoreCase(subjectName)) {
                    continue;
                }
                if (optionalSubjects.contains(subjectType)) {
                    System.out.println("이미 선택된 과목입니다. 다른 과목을 선택해주세요.");
                } else optionalSubjects.add(subjectType);
            }
            if (optionalSubjects.size() >= 2) {
                screenService.askKeepOrStop();
                String keepOrStop = sc.nextLine();
                if (keepOrStop.equals("2")) {
                    break;
                }
            }
        }
        return optionalSubjects;
    }
    public Integer getIDforscore(){
        return ID;

    }


}