package Main;

import Service.CalculateService;
import Service.StudentAppender;
import Service.ScreenService;
import Service.StudentReader;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ScreenService screenService = new ScreenService();
        StudentAppender studentAppender = new StudentAppender();
        StudentReader studentReader = new StudentReader();

        CalculateService calculateService = new CalculateService();
        while (true) {
            screenService.mainPage();
            String input = sc.nextLine();
            switch (input) {
                case ("1"):   // 1. 수강생 정보 및 과목 입력하기
                    studentAppender.append();
                    break;
                case ("2"):   // 2. 수강생 정보 조회하기
                    studentReader.read();
                    break;
                case ("3"):  // 3. 수강생의 과목별 시험 회차 및 점수를 등록하기
                    break;
                case ("4"):  // 4. 수강생 과목별 회차 점수 수정하기
                    break;
                case ("5"):  // 5. 수강생의 특정 과목 회차별 등급을 조회
                    calculateService.getGradeBySubjectAndTimes();
                    break;
                default: screenService.mainPage();
                    input = sc.nextLine();
                    break;
            }
        }


    }
}