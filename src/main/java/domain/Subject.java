package domain;


import common.enumeration.SubjectType;

import java.util.List;
public class Subject {
    SubjectType subjectId;
    List<Score> scoreList;
    public Subject(){}
    public Subject(SubjectType subjectId, List<Score> scoreList){
        this.subjectId = subjectId;
        this.scoreList = scoreList;
    }
    public SubjectType getSubjectId() {
        return subjectId;
    }
    public List<Score> getScoreList() {
        return scoreList;
    }
}
