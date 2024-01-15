package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Subject {

    private String subjectId;
    private String subjectName;


    public Subject(String subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;

    }

    // Getter
    public String getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }


// id를 생성해줘야 할것 같다. 필수에 따라, 선택에 따라서!



// key로 student 객체를 사용
// computeIfAbsent은 Map의 메서드로 주어진 키가 매핑되지 않았을 때 새로운 ArrayList<String>을 만드는 기능을 한다.
// student를 Key로 하는 값이 이미 존재하면 기존값(ArrayList)을 사용하고, 없으면 새로운 ArrayList을 생성해서 map 에 추가한다.


    // 필수 과목 리스트
    Map<String, List<String>> essentialSubjectMap = new HashMap<>();
    public void makeEssentialSubjectList(String student, String subjectName) {
        List<String> EsubjectList = essentialSubjectMap.computeIfAbsent(student, studentKey -> new ArrayList<>());   // 람다식 공부하기
        EsubjectList.add(subjectName);
    }

    // 선택 과목 리스트
    Map<String, List<String>> optionalSubjecMap = new HashMap<>();
    public void makeOptionalSubjectList(String student, String subjectName) {
        List<String> OsubjectList = optionalSubjecMap.computeIfAbsent(student, studentKey -> new ArrayList<>());
        OsubjectList.add(subjectName);
    }

    public List<String> getEessentialSubjectList(String student) {
        return essentialSubjectMap.getOrDefault(student, new ArrayList<>());
    }

    public List<String> getOptionalSubjectList(String student) {
        return optionalSubjecMap.getOrDefault(student, new ArrayList<>());
    }
}
