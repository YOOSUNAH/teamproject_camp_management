package Main;

import Service.SaveStudentInform;
import Service.ScreenService;
import Service.SearchStudentInform;
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
        Student student = new Student("", "");
        SaveStudentInform saveStudentInform = new SaveStudentInform();
        SearchStudentInform searchStudentInform = new SearchStudentInform();

        while (true) {
            screenService.mainPage();
            String input = sc.nextLine();
            switch (input) {
                case ("1"):   // 1. 수강생 정보 및 과목 입력하기
                    saveStudentInform.saveStudentInform();
                    break;
                case ("2"):   // 2. 수강생 정보 조회하기
                    searchStudentInform.searchStudentInform(student.getStudentId(), student.getStudentName());
                    break;
                case ("3"):  // 3. 수강생의 과목별 시험 회차 및 점수를 등록하기
                    break;
                case ("4"):  // 4. 수강생 과목별 회차 점수 수정하기
                    break;
                case ("5"):  // 5. 수강생의 특정 과목 회차별 등급을 조회
                    break;
                default: screenService.mainPage();
                    input = sc.nextLine();
                    break;
            }
        }


    }
}