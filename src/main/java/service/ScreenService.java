package service;

import data.ScreenData;
import data.ScreenStage;

public class ScreenService {

    private final ScreenStage screenStage = new ScreenStage();

    public ScreenService(){
    }

    public void print(String screenStage){
        System.out.println(screenStage);
    }

    public void selectSubjectE(){print(screenStage.getScreenStage(ScreenData.SelectSubjectE));}
    public void selectSubjectO(){print(screenStage.getScreenStage(ScreenData.SelectSubjectO));}

    public void mainPage(){
        print(screenStage.getScreenStage(ScreenData.MainPage));
    }
    public void inputStudentIdNumber(){
        print(screenStage.getScreenStage(ScreenData.Input_Student_IdNumber));
    }
    public void inputStudentName(){
        print(screenStage.getScreenStage(ScreenData.Input_Student_Name));
    }
    public void askKeepOrStop(){
        print(screenStage.getScreenStage(ScreenData.AskKeepOrStop));
    }
}
