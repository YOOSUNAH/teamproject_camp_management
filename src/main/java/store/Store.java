package store;

import domain.Score;
import domain.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {

    // 수강생 정보를 저장하고, 조회하고, 삭제하는 인터페이스만 두기!

    private static Map<Integer, Student> students = new HashMap<>();

    public static void addStudent(Student student) {
        students.put(student.getStudentId(), student);
    }

    public static Student findStudent(Integer studentId) {
        return students.get(studentId);
    }

    public static Student deleteStudent(Integer studentId) {
        return students.remove(studentId);
    }

    public static boolean returnkey(Integer studentId) {
        return students.containsKey(studentId);
    }


    // 학생 Id,  Score( 과목Id, 회차, 점수)
    private static Map<Integer, Score> scores = new HashMap<>();

    public static void addScore(Score score) {
        scores.put(score.getStudentId(), score);
    }


}
