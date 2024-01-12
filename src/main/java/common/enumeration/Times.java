package common.enumeration;

public enum Times {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10);

    public Integer getTime() {
        return time;
    }

    private final Integer time;

    Times(Integer time){
        this.time = time;
    }
}
