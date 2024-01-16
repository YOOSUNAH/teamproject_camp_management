package service;
import java.util.Scanner;
public class Controller {
    public void start() {
        Scanner sc = new Scanner(System.in);
        ScreenService screenService = new ScreenService();
        while (true) {
            screenService.mainPage();
            String input = sc.nextLine();
            switch (input) {
                case "1" -> {
                    append();
                }
                case "2" -> {
                    read();
                }
                case "3" -> {
                    scoreAppend();
                }
                case "4" -> {
                    scoreRead();
                }
                case "5" -> {
                    delete();
                }
                case "6" -> {
                    getGradeBySubjectAndTimes();
                }
            }
        }
    }
    StudentAppender studentAppender = new StudentAppender();
    StudentReader studentReader = new StudentReader();
    StudentDeleter studentDeleter = new StudentDeleter();
    CalculateService calculateService = new CalculateService();
    //    CalculateService calculateService = new CalculateService();
    ScoreAppender ScoreAppender = new ScoreAppender();
    ScoreReader scoreReader = new ScoreReader();

    public void append() {
        studentAppender.append();
    }
    public void read() {
        studentReader.read();
    }
    public void delete() {
        studentDeleter.delete();
    }
    public void scoreAppend() {
        ScoreAppender.scoreAppend();
    }
    public void scoreRead() {
        scoreReader.scoreRead();
    }


    public void getGradeBySubjectAndTimes() {
        calculateService.getGradeBySubjectAndTimes();
//        calculateService.getGradeBySubjectAndTimes();

    }

}