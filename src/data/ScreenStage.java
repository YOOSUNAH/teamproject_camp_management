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
        screenStageMap.put(ScreenData.MainPage,
                "=======내배캠 관리에 오신것을 환영합니다.==========\n" +
                        "1. 수강생 정보 및 과목 입력하기\n" +
                        "2. 수강생 정보 조회하기\n" +
                        "3. 수강생의 과목별 시험 회차 및 점수를 등록하기\n" +
                        "4. 수강생 과목별 회차 점수 수정하기\n" +
                        "5. 수강생의 특정 과목 회차별 등급을 조회\n");

        screenStageMap.put(ScreenData.Input_Student_IdNumber, "수강생 고유번호를 입력해주세요");
        screenStageMap.put(ScreenData.Input_Student_Name, "수강생 이름을 입력해주세요");
        screenStageMap.put(ScreenData.SelectSubjectE, "필수 과목을 3개 이상 선택헤주세요. (과목명만 입력해 주세요.)");
        screenStageMap.put(ScreenData.SelectSubjectO, "선택 과목을 2개 이상 선택헤주세요.  (과목명만 입력해 주세요.)");
        screenStageMap.put(ScreenData.Find_Student_Name, "찾고자 하는 수강생의 이름을 입력해주세요.");
        screenStageMap.put(ScreenData.Find_Student_IdNumber, "찾고자 하는 수강생의 고유 번호를 입력해주세요.");
        screenStageMap.put(ScreenData.AskKeepOrStop, "1. 계속 선택 하기   2. 그만 선택 하기  (번호만 입력해 주세요)\n");
    }
}