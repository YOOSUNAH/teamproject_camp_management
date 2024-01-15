package Service;

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

    public void append() {
        // 1.수강생 정보 입력하기

        boolean idcheck=true;
        int coin=0;

        //여기서 입력받은 studentId가 기존생성되어있던 student 객체의 studentId와 중복한다면 걸러내는 조건문을 만들어보자 by일하
        while (idcheck) {
            screenService.inputStudentIdNumber();
            Integer studentId = Integer.parseInt(sc.nextLine());
            Integer ID = studentId;

            if(coin>=1){
                if(Store.returnkey(studentId)){
                    System.out.println("ID값이 중복되었습니다. 다른 ID값을 입력해주세요."); //경고문구 출력
                }else{
                    idcheck=false;
                }
            }
        }
        //가능하면 이렇게 하지 말자 다음 프로젝트 부터는 ...
        // key값인 id '맵키 조회'
        //애초에 student id를 우리가 정해서 절대로 겹치지 않도록 하는 장치가 필요함.


        screenService.inputStudentName();
        String studentName = sc.nextLine();
        // 2.수강생 과목 입력하기
        // 이 객체가 while문 안에있을 경우, 새로운 객체가 계속 생성되기 때문에 while문 밖에 있어야 한다.
        // 필수 과목 선택  (3개 미만까지는 계속 while문)
        List<SubjectType> essentialSubjects = addEssentialSubjects();
        List<SubjectType> optionalSubjects = addOptionalSubjects();
        Student student = new Student(
                studentId,
                studentName,
                essentialSubjects,
                optionalSubjects
        );

        Store.addStudent(student);
//        coin++;
    }

    private List<SubjectType> addOptionalSubjects() {
        List<SubjectType> optionalSubjects = new ArrayList<>();
        // 선택과목 선택
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

    public Integer getIDforscore() {

        return ID;
    }
}

//커밋 로그tst
//커밋 로그tst2