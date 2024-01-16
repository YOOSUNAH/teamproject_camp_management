package store;

import domain.Score;
import domain.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public class Store {

    // 수강생 정보를 저장하고, 조회하고, 삭제하는 인터페이스만 두기!
    // Student( Id, 이름, 과목 목록)

    private static Map<Integer, Student> students = new HashMap<>();

    public static void addStudent(Student student) {
        students.put(student.getStudentId(), student);
    }

    public static Student findStudent(Integer studentId) {
        return students.get(studentId);
    }

    public static void showAllStudent() {
        for (Entry<Integer, Student> entrySet : students.entrySet()) {
            System.out.println("[수강생 고유번호] : " + entrySet.getKey().toString() + " [수강생 이름] : " + entrySet.getValue().getStudentName());  
            System.out.println("[수강한 필수 과목] : " + entrySet.getValue().getEssentialSubjects());
              System.out.println("[수강한 선택 과목] : " + entrySet.getValue().getOptionalSubjects());
        }
    }

    public static Student deleteStudent(Integer studentId) {
        return students.remove(studentId);
    }

    public static boolean returnKey(Integer studentId) {
        return students.containsKey(studentId);
    }


    // 학생 Id,  Score( 과목Id, 회차, 점수)
    private static Map<Integer, Score> scores = new HashMap<>();


    // 회차 - 점수
    private static Map<Integer, Integer> scoresByRound = new HashMap<>();
//    public static void addScoresByRound(Score score, Integer round){
//        scoresByRound.put(score.getRound().get(round),score.getScore().get(round));
//    }
    //

    public static void addScore(Integer studentId, Score score) {
        scores.put(studentId, score);
    }

    public static Score readScore(Integer studentId) {
       return scores.get(studentId);
    }

//    public static void addSubjectAndRoundAndScore(Integer studentId, Map scoresByRound) {  // 과목, < 회차, 점수>
//        Integer subjectId = Integer.parseInt(String.valueOf(scores.get(studentId).getSubjectID()));
//        scoresByRound.put(subjectId, scoresByRound);
//    }
//
//    public static void addStudentandSubjectAndRoundAndScore(Integer studentId, Map subjectAndRoundAndScore) {
//        studentandSubjectAndRoundAndScore.put(studentId, subjectAndRoundAndScore);
//    }

}
