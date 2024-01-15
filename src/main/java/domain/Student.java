package domain;

import common.enumeration.SubjectType;

import java.util.List;

public class Student {

    private Integer studentId;
    private String studentName;

    private List<SubjectType> essentialSubjects;
    private List<SubjectType> optionalSubjects;


    public Student(
        Integer studentId,
        String studentName,
        List<SubjectType> essentialSubjects,
        List<SubjectType> optionalSubjects
    ) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.essentialSubjects = essentialSubjects;
        this.optionalSubjects = optionalSubjects;
    }

    //     Getter
    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public List<SubjectType> essentialSubjects(){
        return essentialSubjects;
    }

    public List<SubjectType> optionalSubjects(){
        return optionalSubjects;
    }
}


