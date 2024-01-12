package common.enumeration;

public enum Subject {
    JAVA("Java",Type.REQUIRED),
    OOP("Oop",Type.REQUIRED),
    SPRING("Spring",Type.REQUIRED),
    JPA("Jpa",Type.REQUIRED),
    MYSQL("Mysql",Type.REQUIRED),
    DESIGNPATTERN("Designpattern",Type.ELECTIVE),
    SPRINGSEQURITY("Springsequrity",Type.ELECTIVE),
    REDIS("Redis",Type.ELECTIVE),
    MONGODB("Mongodb",Type.ELECTIVE);

    private final String name;
    private final Type type;

    Subject(String name, Type type){
        this.name = name;
        this.type = type;
    }
}
