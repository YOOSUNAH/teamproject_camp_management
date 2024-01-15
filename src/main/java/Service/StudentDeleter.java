package Service;

import domain.Student;
import store.Store;

import java.util.Scanner;

public class StudentDeleter {
    Scanner sc = new Scanner(System.in);
    ScreenService screenService = new ScreenService();
    public void delete() {
        screenService.inputStudentIdNumber();
        String searchStudentId = sc.nextLine();
        Student student = Store.deleteStudent(searchStudentId);
        System.out.println(student.getStudentName() + " 수강생의 정보가 삭제되었습니다.");
    }
}

