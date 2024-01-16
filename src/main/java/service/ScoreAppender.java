package service;

import common.enumeration.SubjectType;
import domain.Score;
import domain.Student;
import domain.Subject;
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

        // store에서 가져오기
        // null pointexception 나지 않게
        if (studentId.equals(Store.findStudent(studentId).getStudentId())){ // Id 일치 하는지 확인
            if ((Store.findStudent(studentId).getEssentialSubjects().contains(subject))  // 과목 일치하는지 확인
                || (Store.findStudent(studentId).getOptionalSubjects().contains(subject))) {
                Score score = new Score(
                    studentId,
                    SubjectType.valueOf(String.valueOf(subject)),
                    round,
                    inputScore
                );
                Store.addScore(studentId, score);
                Store.showAllStudent();
            }
        }
    }
}

