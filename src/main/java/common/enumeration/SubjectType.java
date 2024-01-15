package common.enumeration;

import java.util.Objects;

public enum SubjectType {

    JAVA(Type.ESSENTIAL_SUBJECT),
    OOP(Type.ESSENTIAL_SUBJECT),
    SPRING(Type.ESSENTIAL_SUBJECT),
    JPA(Type.ESSENTIAL_SUBJECT),
    MYSQL(Type.ESSENTIAL_SUBJECT),
    DESIGNPATTERN(Type.OPTIONAL_SUBJECT),
    SPRINGSEQURITY(Type.OPTIONAL_SUBJECT),
    REDIS(Type.OPTIONAL_SUBJECT),
    MONGODB(Type.OPTIONAL_SUBJECT);

    private final Type type;

    SubjectType(Type type){

        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public static Type getTypeBySubjectId(String subjectId) {
        for (SubjectType subject : SubjectType.values()) {
            if(Objects.equals(subject.name(),subjectId)){
                return subject.getType();
            }
        }
        return null;
    }
}
