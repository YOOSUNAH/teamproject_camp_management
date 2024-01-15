package Main;

import Service.StudentAppender;
import Service.ScreenService;
import Service.StudentDeleter;
import Service.StudentReader;
import domain.Student;
import store.Store;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ScreenService screenService = new ScreenService();
        StudentAppender studentAppender = new StudentAppender();
        StudentReader studentReader = new StudentReader();
        StudentDeleter studentDeleter = new StudentDeleter();

        //    "1. 수강생 정보 및 과목 입력하기\n" +
        //    "2. 수강생 정보 조회하기\n" +
        //    "3. 수강생의 과목별 시험 회차 및 점수를 등록하기\n" +
        //    "4. 수강생 정보 삭제하기" +
        //    "5. 수강생의 특정 과목 회차별 등급을 조회\n");
        while (true) {
            screenService.mainPage();
            String input = sc.nextLine();
            switch (input) {
                case ("1"):
                    studentAppender.append();
                    break;
                case ("2"):
                    studentReader.read();
                    break;
                case ("3"):
                    break;
                case("4"):
                      studentDeleter.delete();
                      break;
                default: screenService.mainPage();
                    input = sc.nextLine();
                    break;
            }
        }


    }
}