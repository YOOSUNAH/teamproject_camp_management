package store;

import domain.Student;

import java.util.HashMap;
import java.util.Map;

public class Store {

    // 수강생 정보를 저장하고, 조회하는 인터페이스만 두기!

    private static Map<Integer, Student> students = new HashMap<>();

    public static void addStudent(Student student){
        students.put(student.getStudentId(), student);
    }
    public static Student findStudent(Integer studentId){
        return students.get(studentId);
    }

    public static Student deleteStudent(Integer studentId){
        return students.remove(studentId);
    }

    public static boolean returnkey(Integer studentId){
        return students.containsKey(studentId);
    }


}
