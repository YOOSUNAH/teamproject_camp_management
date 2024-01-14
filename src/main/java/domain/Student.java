package domain;

import common.enumeration.SubjectType;

import java.util.List;

public class Student {

    private String studentId;
    private String studentName;

    private List<SubjectType> essentialSubjects;
    private List<SubjectType> optionalSubjects;


    public Student(
        String studentId,
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
    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }
}


