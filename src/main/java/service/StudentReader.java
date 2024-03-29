package service;

import domain.Student;
import store.Store;

import java.util.Scanner;

public class StudentReader {
    Scanner sc = new Scanner(System.in);
    ScreenService screenService = new ScreenService();
    public void read() {
        screenService.inputStudentIdNumber();
        Integer searchStudentId = sc.nextInt();
        Student student = Store.findStudent(searchStudentId);

        if(student == null ||  // null을 조심하자
            student.getStudentId()==0){
            System.out.println("저장된 수강생 정보가 없습니다.");
            return;
        }
        System.out.println(student.getStudentName() + "이 수강한 과목");
        System.out.println("필수 과목 : " + student.getEssentialSubjects() +"\n선택 과목 : "+ student.getOptionalSubjects());
    }
}

