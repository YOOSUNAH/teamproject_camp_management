package common.enumeration;
import java.util.Objects;
public enum SubjectType {
    JAVA(1,Type.ESSENTIAL_SUBJECT),
    OOP(2,Type.ESSENTIAL_SUBJECT),
    SPRING(3,Type.ESSENTIAL_SUBJECT),
    JPA(4,Type.ESSENTIAL_SUBJECT),
    MYSQL(5,Type.ESSENTIAL_SUBJECT),
    DESIGNPATTERN(6,Type.OPTIONAL_SUBJECT),
    SPRINGSEQURITY(7,Type.OPTIONAL_SUBJECT),
    REDIS(8,Type.OPTIONAL_SUBJECT),
    MONGODB(9,Type.OPTIONAL_SUBJECT);
    private final Integer id;
    private final Type type;
    SubjectType(Integer id, Type type){
        this.id = id;
        this.type = type;
    }
    public  Integer getId(){
        return id;
    }
    public Type getType() {
        return type;
    }
    public static Type getTypeBySubjectId(Integer subjectId) {
        for (SubjectType subject : SubjectType.values()) {
            if(subject.name().equals(subjectId.toString())){
                return subject.getType();
            }
        }
        return null;
    }
}





