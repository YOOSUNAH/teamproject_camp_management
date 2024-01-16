package service;

import common.enumeration.SubjectType;
import domain.Student;
import store.Store;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentAppender {
    Scanner sc = new Scanner(System.in);

    ScreenService screenService = new ScreenService();

    Integer ID = 0;
    Integer showStudentId = 1;
    public void append() {
        // 1.수강생 정보 입력하기
            System.out.println("당신의 고유 번호는 " + showStudentId + "번 입니다.");
            showStudentId++;
        // id 중복 확인
        boolean idcheck = true;
        Integer studentId = 0;
        Integer ID;
        while (idcheck) {
            screenService.inputStudentIdNumber();
            studentId = Integer.parseInt(sc.nextLine());
            if (Store.returnkey(studentId)) {
                System.out.println("ID값이 중복되었습니다. 화면에 나온 올바른 고유번호를 입력해주세요."); //경고문구 출력
            } else {
                idcheck = false;
            }
        }
        ID = studentId;
        //
        screenService.inputStudentName();
        String studentName = sc.nextLine();
        List<SubjectType> essentialSubjects = addEssentialSubjects();
        List<SubjectType> optionalSubjects = addOptionalSubjects();
        Student student = new Student(
            studentId,
            studentName,
            essentialSubjects,
            optionalSubjects
        );
        Store.addStudent(student);
    }
    private List<SubjectType> addEssentialSubjects() {
        List<SubjectType> essentialSubjects = new ArrayList<>();
        while (true) {
            screenService.selectSubjectE();
            System.out.println("1." + SubjectType.JAVA);
            System.out.println("2." + SubjectType.OOP);
            System.out.println("3." + SubjectType.SPRING);
            System.out.println("4." + SubjectType.JPA);
            System.out.println("5." + SubjectType.MYSQL);

            String subjectName = sc.nextLine();
            for (SubjectType subjectType : SubjectType.values()) {
                if (!subjectType.name().equalsIgnoreCase(subjectName)) {
                    continue;
                }
                if (essentialSubjects.contains(subjectType)) {
                    System.out.println("이미 선택된 과목입니다. 다른 과목을 선택해주세요.");
                } else essentialSubjects.add(subjectType);
            }


            if (essentialSubjects.size() >= 3) {
                screenService.askKeepOrStop();
                String keepOrStop1 = sc.nextLine();
                if (keepOrStop1.equals("2")) {
                    break;
                }
            }
        }
        return essentialSubjects;
    }

    private List<SubjectType> addOptionalSubjects() {
        List<SubjectType> optionalSubjects = new ArrayList<>();
        while (true) {
            screenService.selectSubjectO();
            System.out.println("1." + SubjectType.DESIGNPATTERN);
            System.out.println("2." + SubjectType.SPRINGSEQURITY);
            System.out.println("3." + SubjectType.REDIS);
            System.out.println("4." + SubjectType.MONGODB);
            String subjectName = sc.nextLine();
            for (SubjectType subjectType : SubjectType.values()) {
                if (!subjectType.name().equalsIgnoreCase(subjectName)) {
                    continue;
                }
                if (optionalSubjects.contains(subjectType)) {
                    System.out.println("이미 선택된 과목입니다. 다른 과목을 선택해주세요.");
                } else optionalSubjects.add(subjectType);
            }
            if (optionalSubjects.size() >= 2) {
                screenService.askKeepOrStop();
                String keepOrStop = sc.nextLine();
                if (keepOrStop.equals("2")) {
                    break;
                }
            }
        }
        return optionalSubjects;
    }

    public Integer getIDforscore() {
        return ID;

    }


}