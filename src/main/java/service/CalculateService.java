package service;

import common.enumeration.SubjectType;
import common.enumeration.Type;
import store.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CalculateService {
    private Type type;
    List<Double> scoreList = new ArrayList<>();
    Double score = 0.0;
    Scanner scanner = new Scanner(System.in);

    public char calculateEssentialGrade() {
        System.out.println("확인하고 싶은 학생의 공유번호를 입력해주세요");
        Integer studentId = Integer.parseInt(scanner.nextLine());
        String subject = String.valueOf(Store.readScore(studentId).getSubjectID());
        //  subject -> subjectTypoe에서 -> subjectID 찾아오기 -> subject 알아내기
        Double essentialScore = Double.valueOf(Store.readScore(studentId).getScore());

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

    public char calculateOptionalGrade() {
        System.out.println("확인하고 싶은 학생의 공유번호를 입력해주세요");
        Integer studentId = Integer.parseInt(scanner.nextLine());
        Double optionalScore = Double.valueOf(Store.readScore(studentId).getScore());
        char grade = ' ';
        if (optionalScore >= 90 && optionalScore <= 100)
            grade = 'A';
        else if (optionalScore >= 80 && optionalScore <= 89)
            grade = 'B';
        else if (optionalScore >= 70 && optionalScore <= 79)
            grade = 'C';
        else if (optionalScore >= 60)
            grade = 'D';
        else if (optionalScore >= 50)
            grade = 'F';
        else
            grade = 'N';
        return grade;
    }

    // 과목 점수별, 회차별 등급 조회
    public char getGradeBySubjectAndTimes() {
        Integer studentId = Integer.parseInt(scanner.nextLine());
        Integer subjectId = scanner.nextInt();
//        subjectId  : subject 저장 구현되면 불러오는 로직 추가
        type = SubjectType.getTypeBySubjectId(subjectId);
        return type.equals(Type.ESSENTIAL_SUBJECT) ? calculateEssentialGrade(score) : calculateOptionalGrade(score);
    }

    // 학생, 과목 기준 추가
    public char averageGradeBySubject() {
        Integer studentId = Integer.parseInt(scanner.nextLine());
        Integer subjectId = scanner.nextInt();
        type = SubjectType.getTypeBySubjectId(subjectId);
        Double avgScore, sum = 0.0;
        for (Double score : scoreList) {
            sum += score;
        }
        avgScore = sum / scoreList.size();
        return type.equals(Type.ESSENTIAL_SUBJECT) ? calculateEssentialGrade(avgScore) : calculateOptionalGrade(avgScore);
    }

    // 학생, 회차별 평균
    public char averageGradeByTimes() {
        Integer studentId = Integer.parseInt(scanner.nextLine());
        Integer subjectId = scanner.nextInt();
        type = SubjectType.getTypeBySubjectId(subjectId);
        Double avgScore, sum = 0.0;
        for (Double score : scoreList) {
            sum += score;
        }
        avgScore = sum / scoreList.size();
        return type.equals(Type.ESSENTIAL_SUBJECT) ? calculateEssentialGrade(avgScore) : calculateOptionalGrade(avgScore);
    }
}