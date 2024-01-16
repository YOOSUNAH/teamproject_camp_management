package domain;

import common.enumeration.SubjectType;

import java.util.List;


public class Score {

    private final Integer studentId;
    private final SubjectType subjectID;
    private final Integer round;
    private final Integer score;


    public Score(Integer studentId, SubjectType subjectID,  Integer round,  Integer score) {
        this.studentId = studentId;
        this.subjectID = subjectID;
        this.round = round;
        this.score = score;
    }

    //     Getter
    public Integer getStudentId() {
        return studentId;
    }
    public SubjectType getSubjectID() {  // 무슨 과목인지
        return subjectID;
    }

    public Integer getRound() {  // 회차
        return round;
    }

    public  Integer getScore() {  // 점수
        return score;
    }

}
