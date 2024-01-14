package store;

import domain.Student;

import java.util.HashMap;
import java.util.Map;

public class Store {

    // 수강생 정보

    private static Map<String, Student> students = new HashMap<>();

    public static void addStudent(Student student){
        students.put(student.getStudentId(), student);
    }
    public static Student findStudent(String studentId){
        return students.get(studentId);




    }


}
