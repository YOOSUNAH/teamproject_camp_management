package data;

import java.util.HashMap;
import java.util.Map;

public class ScreenStage {

    private final Map<ScreenData, String> screenStageMap = new HashMap<>();

    public ScreenStage() {
        screenInitializationStage();
    }

    public String getScreenStage(ScreenData screenData) {
        return screenStageMap.get(screenData);
    }

    private void screenInitializationStage() {

        screenStageMap.put(ScreenData.EssentialSubject,
                "1. Java\n" +
                "2.  객체지향\n" +
                "3.  Spring\n" +
                "4. JPA\n" +
                "5. MySQL");

        screenStageMap.put(ScreenData.OptionalSubject,
                "1. 디자인 패턴 \n" +
                "2. Spring Security\n" +
                "3. Redis\n" +
                "4. MongoDB");



    }


}
