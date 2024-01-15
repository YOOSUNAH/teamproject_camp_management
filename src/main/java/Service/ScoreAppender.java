package Service;

import common.enumeration.SubjectType;
import domain.Score;
import domain.Student;
import store.Store;

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ScoreAppender {

    Scanner sc = new Scanner(System.in);
    ScreenService screenService = new ScreenService();

    public void RecordScore(){
        Scanner sc = new Scanner(System.in);

        screenService.inputStudentIdNumber();
        Integer studentId = Integer.parseInt(sc.nextLine());
        screenService.inputStudentName();
        String studentName = sc.nextLine();

        System.out.print("과목 입력:");
        String essentialSubjects  = sc.nextLine();
        System.out.print("회차 입력:");
        Integer timesE = sc.nextInt();
        System.out.print("점수 입력:");
        Integer scoresE = sc.nextInt();
        Integer essentialRecordScore = scoresE;

        System.out.print("과목 입력:");
        String optionalSubjects  = sc.nextLine();
        System.out.print("회차 입력:");
        Integer timesO = sc.nextInt();
        System.out.print("점수 입력:");
        Integer scoresO = sc.nextInt();
        Integer optionalRecordScore= scoresO;

        Map<Integer, Integer> essentialSubjectsScores = null;
        essentialSubjectsScores.put(timesE, essentialRecordScore);

        Map<Integer, Integer> optionalSubjectsScores = null;
        optionalSubjectsScores.put(timesO, scoresO);

        Student student = new Student();
        Score score = new Score();

        if( student.getStudentId().equals(studentId)&& student.getStudentName().equals(studentName))
        for (SubjectType subject:  student.essentialSubjects()) {
            if(subject.equals(essentialSubjects)){
                essentialTimesScores
                Store.essentialSubjectsScores(score, essentialSubjects, timesE, scoresE);
            }
        }
    // score 추가 (과목 , (회차, 점수))
    }


}
