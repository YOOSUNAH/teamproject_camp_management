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
    public void optionalSubject(){
        print(screenStage.getScreenStage(ScreenData.OptionalSubject));
    }


}
