package Service;

import domain.Student;
import domain.Subject;

import javax.swing.*;
import java.util.Scanner;

public class SearchStudentInform {

    Scanner sc = new Scanner(System.in);
    ScreenService screenService = new ScreenService();


    public void searchStudentInform(String studentId, String studentName){
        // 3.수강생 정보 조회하기
        screenService.findStudentIdNumber();
        String searchStudentId = sc.nextLine();
        screenService.findStudentName();
        String searchStudentName = sc.nextLine();

        Subject subject = new Subject(studentId, "");

        if (searchStudentId.equals(studentId) && searchStudentName.equals(studentName)) {
            System.out.println("수강생 아이디 : " + studentId);
            System.out.println("수강생 이름 : " + studentName);
            System.out.println("수강한 필수 과목:  " + subject.getEessentialSubjectList(studentId));
            System.out.println("수강한 선택 과목:  " + subject.getOptionalSubjectList(studentId));
        }
    }
}
