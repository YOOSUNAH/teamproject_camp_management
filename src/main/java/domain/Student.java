package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Student {

    private String studentId;
    private String studentName;
    private static Map<String, String> studentListWithIdNumber = new HashMap<>();

    public Student(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Getter
    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
    public  Map<String, String>  getStudentListWithIdNumber() {
        return studentListWithIdNumber;
    }


    // 수강생 정보 등록 메서드
    public void addToStudentCard() {
        // 수강생의 고유 번호는 중복될 수 없다
        // 중복을 허용하지 않는 List는 중복을 허용하고, Set은 허용하지 않지만 순서가 보장이 안되고, Map 중복을 허용하지 않고, key-value 형태로 저장하니
        // 고유 번호와 이름을 Map으로 저장하는게 좋을 것 같다.
        studentListWithIdNumber.put(this.studentId, this.studentName);







    }
}


