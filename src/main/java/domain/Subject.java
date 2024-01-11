package domain;

import java.util.ArrayList;
import java.util.List;


public class Subject {

    private String subjectId;
    private String subjectName;
    private String subjectType;

    public Subject(String seq, String subjectName, String subjectType) {
        this.subjectId = seq;
        this.subjectName = subjectName;
        this.subjectType = subjectType;
    }

    // Getter
    public String getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getSubjectType() {
        return subjectType;
    }

    public void makeSubjectList(String seq, String subjectName, String subjectType) {
 //    선택한 필수 과목이 3개 미만일 수 없다 -> list로 저장하는게 좋을 것 같다.
//     (계속 추가될수 있게 배열이 아닌 List, 순서대로 있는게 나중에 조회하기 편할것 같으니 순서가 보장된 list)
        List<String> essentialSubjectList = new ArrayList<>();
        essentialSubjectList.add(seq);
        essentialSubjectList.add(subjectName);
        essentialSubjectList.add(subjectType);

    }
}