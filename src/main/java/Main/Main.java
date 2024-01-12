package Main;

import Service.ScreenService;
import domain.Student;
import domain.Subject;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScreenService screenService = new ScreenService();
//        screenService.mainPage();
//        String input = sc.nextLine();
//while(true){
//        switch(input){
//            case("1"): 해당 메서드 호출
//                break;
//            case("2"):
//                break;
//            case("3"):
//                break;
//            case("4"):
//                break;
//            case("5"):
//                break;
//            default:
//
//                break;
//        }
//    }

        // 1.수강생 정보 입력하기
        screenService.inputStudentIdNumber();
        String studentId = sc.nextLine();
        screenService.inputStudentName();
        String studentName = sc.nextLine();

        Student student = new Student(studentId, studentName);
        student.addToStudentCard();

        // 2.수강생 과목 입력하기
        Subject subjectE = new Subject(studentId, "");

        // 필수 과목 선택  (3개 미만까지는 계속 while문)
        while (true) {
            screenService.selectSubjectE();
            screenService.essentialSubject();
            String subjectName = sc.nextLine();
            subjectE.makeEssentialSubjectList(studentId, subjectName);

            List<String> selectedEssentialSubjects = subjectE.getEessentialSubjectList(studentId);
            if (selectedEssentialSubjects.size() >= 3) {
                System.out.println("1. 계속 선택   2. 그만 선택");
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
            screenService.optionalSubject();
            String subjectName = sc.nextLine();
            subjectO.makeOptionalSubjectList(studentId, subjectName);

            List<String> selectedOptionalSubjects = subjectO.getOptionalSubjectList(studentId);
            if (selectedOptionalSubjects.size() >= 2) {
                System.out.println("1. 계속 선택하시겠습니가?   2. 그만 선택 하시겠습니까?  (번호만 입력해 주세요)");
                String keepOrStop = sc.nextLine();
                if (keepOrStop.equals("2")) {
                    break;
                }
            }
        }


        // 3.수강생 정보 조회하기
        screenService.findStudentIdNumber();
        String searchStudentId = sc.nextLine();
        screenService.findStudentName();
        String searchStudentName = sc.nextLine();

        if (searchStudentId.equals(studentId) && searchStudentName.equals(studentName)) {
            System.out.println("수강생 아이디 : " + student.getStudentId());
            System.out.println("수강생 이름 : " + student.getStudentName());
            System.out.println("수강한 과목:");


        }
    }


}