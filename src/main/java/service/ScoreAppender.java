package service;

import common.enumeration.SubjectType;
import domain.Score;
import domain.Student;
import store.Store;

import java.util.Scanner;

public class ScoreAppender {
    Scanner sc = new Scanner(System.in);
    ScreenService screenService = new ScreenService();

    public void scoreAppend() {
        // 모든 student Id, 이름 출력해서 고르게 하기
        Store.showAllStudent();

        Scanner sc = new Scanner(System.in);
        screenService.inputStudentIdNumber();
        Integer studentId = Integer.parseInt(sc.nextLine());
        screenService.inputStudentName();
        String studentName = sc.nextLine();
        System.out.print("과목 입력:");
        String subject = sc.nextLine();
        System.out.print("회차 입력:");
        Integer round = sc.nextInt();
        System.out.print("점수 입력:");
        Integer inputScore = sc.nextInt();

        SubjectType essentialSubject = SubjectType.valueOf(subject);
        SubjectType optionalSubject = SubjectType.valueOf(subject);
        Integer subjectID = 0;

        for (SubjectType subjectIDFromSubjectType : SubjectType.values()) {
             subjectID = subjectIDFromSubjectType.getId();
            }


        // store에서 가져오기
        // null pointexception 나지 않게

//        System.out.println("학생이 있는지 확인하기 :" + student.getStudentName());
//        if (student.getStudentId().equals(studentId)) { // null
//            for (SubjectType subjectT : student.getEssentialSubjects()) {
//                Score score = new Score(
//                    studentId,
//                    SubjectType.valueOf(String.valueOf(subjectID)),
//                    round,
//                    inputScore
//                );
//                Store.addScore(score);
//            }
//        }


    }


}
