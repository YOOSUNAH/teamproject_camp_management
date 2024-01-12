package domain;

public class Score {
    private String scoreId;
    private Integer score;

    public Score(String seq) {
        this.scoreId = seq;
    }

    // Getter
    public String getScoreId() {
        return scoreId;
    }

}
