package service;

import common.enumeration.Times;
import common.enumeration.Type;

import java.util.List;

public class CalculateService {

    public char calculateRequiredGrade(int requiredScore) {
        char grade = ' ';
        if (requiredScore >= 95 && requiredScore <=100)
            grade = 'A';
        else if (requiredScore >= 90 && requiredScore <= 94)
            grade = 'B';
        else if (requiredScore >= 80 && requiredScore <= 89)
            grade = 'C';
        else if (requiredScore >= 70 && requiredScore <= 79)
            grade = 'D';
        else if (requiredScore >= 60 && requiredScore<=69)
            grade = 'F';
        else
            grade = 'N';
        return grade;
    }

    public char calculateElectiveGrade(int electiveScore) {
        char grade=' ';
        if (electiveScore >= 90 && electiveScore <= 100)
           grade = 'A';
        else if (electiveScore >= 80 && electiveScore <= 89)
            grade = 'B';
        else if (electiveScore >= 70 && electiveScore <= 79)
            grade = 'C';
        else if (electiveScore >= 60)
            grade = 'D';
        else if (electiveScore >= 50)
            grade = 'F';
        else
            grade = 'N';
        return grade;
    }

    // 학생, 과목 기준 추가
    public char AverageGradeBySubject(String studentId,String subjectId, Type type, List<Integer> scoreList) {
        int avgScore, sum = 0;
        for (Integer integer : scoreList) {
            sum += integer;
        }
        avgScore = sum / scoreList.size();
        return type.equals(Type.REQUIRED) ? calculateRequiredGrade(avgScore) : calculateElectiveGrade(avgScore);
    }

    // 학생, 회차별 평균
//    public char AverageGradeByTime(String studentId, Times time, Type type, List<Integer> scoreList){
//        for(int i =0;i<scoreList.size();i++){
//            if(type.)
//        }
//        return ' ';
//    }
}
