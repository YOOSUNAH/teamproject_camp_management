package main;

import service.*;

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
        ScoreReader scoreReader = new ScoreReader();

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
                        scoreReader.scoreRead();
                    }
                    case "5" -> {
                        studentDeleter.delete();
                    }
                    case "6" -> {
                        calculateService.getGradeBySubjectAndTimes();
                    }
                }
            }
        }
    }
