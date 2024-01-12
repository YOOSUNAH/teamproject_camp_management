package common.enumeration;


public enum Subject {
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

    Subject( Type type){

        this.type = type;
    }
}
