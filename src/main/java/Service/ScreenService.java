package Service;

import data.ScreenData;
import data.ScreenStage;

public class ScreenService {

    private final ScreenStage screenStage = new ScreenStage();

    public ScreenService(){
        defaultbehavior();
    }

    public void print(String screenStage){
        System.out.println(screenStage);
    }

    private void defaultbehavior() {
        print("\n\n==================================\n\n");
    }

    public void essentialSubject(){
        print(screenStage.getScreenStage(ScreenData.EssentialSubject));
    }
    public void essentialSubject1(){print(screenStage.getScreenStage(ScreenData.EssentialSubject_1));}
    public void essentialSubject2(){print(screenStage.getScreenStage(ScreenData.EssentialSubject_2));}
    public void essentialSubject3(){print(screenStage.getScreenStage(ScreenData.EssentialSubject_3));}
    public void essentialSubject4(){print(screenStage.getScreenStage(ScreenData.EssentialSubject_4));}
    public void essentialSubject5(){print(screenStage.getScreenStage(ScreenData.EssentialSubject_5));}
    public void selectSubjectE(){print(screenStage.getScreenStage(ScreenData.SelectSubjectE));}
    public void selectSubjectO(){print(screenStage.getScreenStage(ScreenData.SelectSubjectO));}

    public void optionalSubject(){print(screenStage.getScreenStage(ScreenData.OptionalSubject));}
    public void optionalSubject1(){print(screenStage.getScreenStage(ScreenData.OptionalSubject_1));}
    public void optionalSubject2(){print(screenStage.getScreenStage(ScreenData.OptionalSubject_2));}
    public void optionalSubject3(){print(screenStage.getScreenStage(ScreenData.OptionalSubject_3));}
    public void optionalSubject4(){print(screenStage.getScreenStage(ScreenData.OptionalSubject_4));}
    public void mainPage(){
        print(screenStage.getScreenStage(ScreenData.MainPage));
    }
    public void inputStudentIdNumber(){
        print(screenStage.getScreenStage(ScreenData.Input_Student_IdNumber));
    }
    public void inputStudentName(){
        print(screenStage.getScreenStage(ScreenData.Input_Student_Name));
    }public void selectSubject(){
        print(screenStage.getScreenStage(ScreenData.SelectSubject));
    }public void findStudentIdNumber(){
        print(screenStage.getScreenStage(ScreenData.Find_Student_IdNumber));
    }public void findStudentName(){
        print(screenStage.getScreenStage(ScreenData.Find_Student_Name));
    }
}
