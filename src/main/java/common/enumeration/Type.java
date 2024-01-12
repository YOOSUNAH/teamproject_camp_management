package common.enumeration;

public enum Type {
    REQUIRED("필수과목"),
    ELECTIVE("선택과목");

    private String typeName;
    Type(String typeName){
        this.typeName = typeName;
    }
}
