package domain;

import common.enumeration.SubjectType;

public class Score {

    private final Integer studentId;
    private final SubjectType subjectType;
    private final Integer score;

    public Score(Integer studentId, SubjectType subjectType, Integer score ) {
        this.studentId = studentId;
        this.score = score;
        this.subjectType = subjectType;
    }
}
