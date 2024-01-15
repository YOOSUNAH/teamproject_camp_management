import enumeration.Type;

import java.util.List;


public class CalculateService {

    public char calculateEssentialGrade(int essentialScore) {
        char grade = ' ';
        if (essentialScore >= 95 && essentialScore <=100)
            grade = 'A';
        else if (essentialScore >= 90 && essentialScore <= 94)
            grade = 'B';
        else if (essentialScore >= 80 && essentialScore <= 89)
            grade = 'C';
        else if (essentialScore >= 70 && essentialScore <= 79)
            grade = 'D';
        else if (essentialScore >= 60 && essentialScore<=69)
            grade = 'F';
        else
            grade = 'N';
        return grade;
    }

    public char calculateOptionalGrade(int optionalScore) {
        char grade=' ';
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

    // 학생, 과목 기준 추가
    public char AverageGradeBySubject(String studentId,String subjectId, Type type, List<Integer> scoreList) {
        int avgScore, sum = 0;
        for (Integer integer : scoreList) {
            sum += integer;
        }
        avgScore = sum / scoreList.size();
        return type.equals(Type.ESSENTIAL_SUBJECT) ? calculateEssentialGrade(avgScore) : calculateOptionalGrade(avgScore);
    }

    // 학생, 회차별 평균
//    public char AverageGradeByTime(String studentId, Times time, Type type, List<Integer> scoreList){
//        for(int i =0;i<scoreList.size();i++){
//            if(type.)
//        }
//        return ' ';
//    }
}
