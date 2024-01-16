package store;

import domain.Score;
import domain.Student;

import java.util.HashMap;
import java.util.Map.Entry;
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

    public static void showAllStudent() {
            for (Entry<Integer, Student> entrySet : students.entrySet()) {
                System.out.println(entrySet.getKey().toString() + " : " + entrySet.getValue().getStudentName()); }
        }

    public static Student deleteStudent(Integer studentId) {
        return students.remove(studentId);
    }

    public static boolean returnkey(Integer studentId) {
        return students.containsKey(studentId);
    }


    // 학생 Id,  Score( 과목Id, 회차, 점수)
    private static Map<Integer, Score> scores = new HashMap<>();

    public static void addScore(Integer studentId, Score score) {
        scores.put(studentId, score);
    }

    public static Score readScore(Integer studentId) {
       return scores.get(studentId);
    }

}
