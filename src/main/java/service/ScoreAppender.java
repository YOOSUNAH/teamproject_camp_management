package service;

import common.enumeration.SubjectType;
import domain.Score;
import domain.Student;
import store.Store;

import java.util.Scanner;

public class ScoreAppender {
    Scanner sc = new Scanner(System.in);
    ScreenService screenService = new ScreenService();
    public void scoreAppend(){
        Scanner sc = new Scanner(System.in);
        screenService.inputStudentIdNumber();
        Integer studentId = Integer.parseInt(sc.nextLine());
        screenService.inputStudentName();
        String studentName = sc.nextLine();
        System.out.print("과목 입력:");
        String subject  = sc.nextLine();
        System.out.print("회차 입력:");
        Integer round = sc.nextInt();
        System.out.print("점수 입력:");
        Integer score = sc.nextInt();

        Student student = new Student();
        Score scores = new Score(studentId, subjectType, round, score);
        SubjectType essentialSubject = SubjectType.valueOf(subject);
        SubjectType optionalSubject = SubjectType.valueOf(subject);

        if(student.getStudentId().equals(studentId)&& student.getStudentName().equals(studentName))
        for (SubjectType subjectT: student.essentialSubjects()) {
            if(subjectT == essentialSubject || subjectT == optionalSubject){
                Store.addScore(scores);
            }
        }
    }
}
