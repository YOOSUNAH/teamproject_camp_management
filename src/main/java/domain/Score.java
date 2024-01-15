package domain;

import common.enumeration.SubjectType;


public class Score {

    private final Integer studentId;
    private final SubjectType subjectType;
    private final Integer round;
    private final Integer score;


    public Score(Integer studentId, SubjectType subjectType, Integer round, Integer score) {
        this.studentId = studentId;
        this.subjectType = subjectType;
        this.round = round;
        this.score = score;
    }

    //     Getter
    public Integer getStudentId() {
        return studentId;
    }
    public SubjectType getSubjectType() {
        return subjectType;
    }

    public Integer getRound() {
        return round;
    }

    public Integer getScore() {
        return score;
    }

}
