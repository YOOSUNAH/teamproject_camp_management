package Service;

import domain.Student;
import common.store.Store;

import java.util.Scanner;

public class StudentReader {
    Scanner sc = new Scanner(System.in);
    ScreenService screenService = new ScreenService();
    public void read() {
        screenService.findStudentIdNumber();
        String searchStudentId = sc.nextLine();
        Student student = Store.findStudent(searchStudentId);
        System.out.println("필수 과목 : " + student.essentialSubjects() +"\n선택 과목 : "+ student.optionalSubjects());
    }
}

