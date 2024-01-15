package enumeration;

public enum Type {
    ESSENTIAL_SUBJECT("필수과목"),
    OPTIONAL_SUBJECT("선택과목");

    private String typeName;
    Type(String typeName){
        this.typeName = typeName;
    }
}
