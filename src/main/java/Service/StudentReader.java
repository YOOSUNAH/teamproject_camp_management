package Service;

import common.enumeration.SubjectType;
import domain.Student;
import store.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader {
    Scanner sc = new Scanner(System.in);
    ScreenService screenService = new ScreenService();
    public void read() {
        screenService.inputStudentIdNumber();
        String searchStudentId = sc.nextLine();
        Student student = Store.findStudent(searchStudentId);

        if(student == null ||  // null을 조심하자
            student.getStudentId().isEmpty()){
            System.out.println("저장된 수강생이 없습니다.");
            return;
        }
        System.out.println(student.getStudentName() + "이 수강한 과목");
        System.out.println("필수 과목 : " + student.essentialSubjects() +"\n선택 과목 : "+ student.optionalSubjects());
    }
}

