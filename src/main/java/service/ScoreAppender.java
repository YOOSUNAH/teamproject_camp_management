package service;

import common.enumeration.SubjectType;
import domain.Score;
import store.Store;

import java.util.List;
import java.util.Scanner;

public class ScoreAppender {
    Scanner sc = new Scanner(System.in);
    ScreenService screenService = new ScreenService();

    public void scoreAppend() {
        // 모든 student Id, 이름 출력해서 고르게 하기
        System.out.println("[저장되어 있는 수강생]");
        Store.showAllStudent();

        Scanner sc = new Scanner(System.in);
        screenService.inputStudentIdNumber();
        Integer studentId = Integer.parseInt(sc.nextLine());
        System.out.print("과목 입력:");
        String subject = sc.nextLine();
        System.out.print("회차 입력:");
        Integer round = sc.nextInt();
        System.out.print("점수 입력:");
        Integer inputScore = sc.nextInt();

        // store에서 가져오기
        // null pointexception 나지 않게
        Integer checkStudentId = Store.findStudent(studentId).getStudentId();
        List<SubjectType> checkEssentialSubjects = Store.findStudent(studentId).getEssentialSubjects();
        List<SubjectType> checkOptionalSubjects = Store.findStudent(studentId).getOptionalSubjects();
        String checkSubject = "";

        if (studentId.equals(checkStudentId)) { // Id 일치 하는지 확인
            for (int i = 0; i < checkEssentialSubjects.size(); i++) {
                checkSubject = String.valueOf(checkEssentialSubjects.get(i));
                if (checkSubject.equals(subject)) {
                    Score score = new Score(
                        studentId,
                        SubjectType.valueOf(checkSubject),
                        round,
                        inputScore
                    );
                    Store.addScore(studentId, score);
                    return;
                }
                return;
            }
            for (int j = 0; j < checkOptionalSubjects.size(); j++) {
                checkSubject = String.valueOf(checkOptionalSubjects.get(j));
                if (checkSubject.equals(subject)) {
                    Score score = new Score(
                        studentId,
                        SubjectType.valueOf(checkSubject),
                        round,
                        inputScore
                    );
                    Store.addScore(studentId, score);
                    return;
                }
                return;

            }
        }
    }
}


