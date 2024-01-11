package Main;

import domain.Student;
import domain.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ////////////////////");
        System.out.println("1. 수강생 정보 등록하기 + 2. 수강생 정보 찾기");

        System.out.println("수강생 고유번호를 입력해주세요");
        String studentId = sc.nextLine();
        System.out.println("수강생 이름을 입력해주세요");
        String studentName = sc.nextLine();

        Student student = new Student(studentId, studentName);

        student.addToStudentCard(studentId, studentName);

        System.out.println("과목을 몇 개 선택하시겠습니까?");
        int numSubjects = sc.nextInt();
        sc.nextLine();

        List<Subject> subjects = new ArrayList<>();

        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("(" + i + ") 선택한 과목을 입력해 주세요.");
            String subjectName = sc.nextLine();
            System.out.println("선택한 과목의 타입을(필수/선택) 입력해 주세요");
            String subjectType = sc.nextLine();

            Subject subject = new Subject(studentId, subjectName, subjectType);
            subjects.add(subject);
        }



        System.out.println("찾고자 하는 수강생의 고유 번호를 입력해주세요");
        String searchStudentId = sc.nextLine();
        System.out.println("찾고자 하는 수강생의 이름을 입력해주세요");
        String searchStudentName = sc.nextLine();

        if (searchStudentId.equals(studentId) && searchStudentName.equals(studentName)){
            System.out.println("수강생 아이디 : " + student.getStudentId());
            System.out.println("수강생 이름 : " + student.getStudentName());
            System.out.println("수강한 과목:");

            for (Subject subject : subjects) {
                System.out.println(subject.getSubjectName() + " (" + subject.getSubjectType() + ")");
            }
        }
    }


}