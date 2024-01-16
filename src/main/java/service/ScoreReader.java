package service;

import domain.Score;
import domain.Student;
import store.Store;

import java.util.Scanner;

public class ScoreReader {
    Scanner sc = new Scanner(System.in);
    ScreenService screenService = new ScreenService();

    public void scoreRead() {
        screenService.inputStudentIdNumber();
        Integer studentId = sc.nextInt();
        Store.readScore(studentId);

        if (Store.readScore(studentId) == null) {
            System.out.println("저장된 수강생 정보가 없습니다.");
            return;
        }
        if (Store.readScore(studentId).getRound() == null) {
            System.out.println("저장된 회차가 없습니다.");
            return;
        }
        if (Store.readScore(studentId).getScore() == null) {
            System.out.println("저장된 점수가 없습니다.");
            return;
        }
        System.out.println(Store.readScore(studentId).getRound() + "차 점수 : " + Store.readScore(studentId).getScore() + "점");
    }
}
