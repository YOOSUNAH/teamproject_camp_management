package service;

import common.enumeration.SubjectType;
import common.enumeration.Type;
import domain.Score;
import store.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class CalculateService {
    private Type type;
    //    Student student = new Student();
    List<Integer> scoreList = new ArrayList<>();
    Integer score = 0;
    Scanner scanner = new Scanner(System.in);

    public char calculateEssentialGrade(Integer essentialScore) {
        char grade = ' ';
        if (essentialScore >= 95 && essentialScore <= 100)
            grade = 'A';
        else if (essentialScore >= 90 && essentialScore <= 94)
            grade = 'B';
        else if (essentialScore >= 80 && essentialScore <= 89)
            grade = 'C';
        else if (essentialScore >= 70 && essentialScore <= 79)
            grade = 'D';
        else if (essentialScore >= 60 && essentialScore <= 69)
            grade = 'F';
        else
            grade = 'N';
        return grade;
    }

    public char calculateOptionalGrade(Integer optionalScore) {
        char grade = ' ';
        if (optionalScore >= 90 && optionalScore <= 100)
            grade = 'A';
        else if (optionalScore >= 80 && optionalScore <= 89)
            grade = 'B';
        else if (optionalScore >= 70 && optionalScore <= 79)
            grade = 'C';
        else if (optionalScore >= 60 && optionalScore <= 69)
            grade = 'D';
        else if (optionalScore >= 50 && optionalScore <= 59)
            grade = 'F';
        else
            grade = 'N';
        return grade;
    }

    // 과목 점수별, 회차별 등급 조회
    public void getGradeBySubjectAndTimes() {
        System.out.println("수강생 고유 번호를 입력해주세요.");
        Integer studentId = Integer.parseInt(scanner.nextLine());
        Store.readScore(studentId);
        System.out.println("조회할 과목을 입력해주세요");
        String subjectId = scanner.nextLine();
        System.out.println("조회할 회차를 선택해주세요.");
        Integer selectRound = Integer.parseInt(scanner.nextLine());
        if (Objects.equals(studentId, Store.readScore(studentId).getStudentId()) && Objects.equals(subjectId, Store.readScore(studentId).getSubjectID().toString())
                && Objects.equals(selectRound, Store.readScore(studentId).getRound())) {
            score = Store.readScore(studentId).getScore();
        } else {
            System.out.println("조회할 정보가 없습니다.");
        }
        type = Store.readScore(studentId).getSubjectID().getType();
        char subjectGrade = type.equals(Type.ESSENTIAL_SUBJECT) ? calculateEssentialGrade(score) : calculateOptionalGrade(score);

        System.out.println(Store.readScore(studentId).getSubjectID() + "과목의 등급은 " + subjectGrade + "입니다.");
    }


    // 학생, 과목 기준 추가
//    public char averageGradeBySubject() {
//        System.out.println("수강생 고유 번호를 입력해주세요.");
//        Integer studentId = Integer.parseInt(scanner.nextLine());
//        Store.readScore(studentId);
//        System.out.println("조회할 과목을 입력해주세요");
//        String subjectId = scanner.nextLine();
//        if(Objects.equals(studentId,Store.readScore(studentId).getStudentId()) && Objects.equals(subjectId,Store.readScore(studentId).getSubjectID().toString())){
//            for(){
//
//            }
//        }
//        Double avgScore, sum = 0.0;
//        for (Integer score : scoreList) {
//            sum += score;
//        }
//        avgScore = sum / scoreList.size();
//
//        type = Store.readScore(studentId).getSubjectID().getType();
//        return type.equals(Type.ESSENTIAL_SUBJECT) ? calculateEssentialGrade(avgScore) : calculateOptionalGrade(avgScore);
//    }
//
//    // 학생, 회차별 평균
//    public char averageGradeByTimes() {
//        Integer studentId = Integer.parseInt(scanner.nextLine());
////        Student student = Store.findStudent(studentId);
//        Integer subjectId = scanner.nextInt();
//        type = SubjectType.getTypeBySubjectId(subjectId);
//        Double avgScore, sum = 0.0;
//        for (Integer score : scoreList) {
//            sum += score;
//        }
//        avgScore = sum / scoreList.size();
//        return type.equals(Type.ESSENTIAL_SUBJECT) ? calculateEssentialGrade(avgScore) : calculateOptionalGrade(avgScore);
//    }
}