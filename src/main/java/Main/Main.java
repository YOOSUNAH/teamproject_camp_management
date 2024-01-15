package Main;

import Service.*;
import domain.Score;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ScreenService screenService = new ScreenService();
        StudentAppender studentAppender = new StudentAppender();
        StudentReader studentReader = new StudentReader();
        StudentDeleter studentDeleter = new StudentDeleter();
        CalculateService calculateService = new CalculateService();
        ScoreAppender ScoreAppender = new ScoreAppender();

            while (true) {
                screenService.mainPage();
                String input = sc.nextLine();
                switch (input) {
                    case "1" -> {
                        studentAppender.append();
                    }
                    case "2" -> {
                        studentReader.read();
                    }
                    case "3" -> {
                        ScoreAppender.scoreAppend();
                    }
                    case "4" -> {
                        studentDeleter.delete();
                    }
                    case "5" -> {
                        calculateService.getGradeBySubjectAndTimes();
                    }
                }
            }
        }
    }
