package domain;

import java.util.*;

public class Score {

    private  Map<String, Map<Integer, Integer>>  optionalSubjectsScores;
    private Map<String, Map<Integer, Integer>>  essentialSubjectsScores;
    private Map<Integer, Integer>essentialTimesScores;

    public Score(
        // (과목)
        // score 추가 (과목 , (회차, 점수))
        Map<String, Map<Integer, Integer>> essentialSubjectsScores,
        Map<String, Map<Integer, Integer>> optionalSubjectsScores,
        Map<Integer, Integer>essentialTimesScores
    ) {
        // score 추가
        this.essentialSubjectsScores = essentialSubjectsScores;
        this.optionalSubjectsScores = optionalSubjectsScores;
    }

    public Score(){

    }
    // score 추가

    public Map<Integer, Integer> essentialTimesScores(Integer times, Integer scores){
        return essentialTimesScores;
    }
    public Map<String, Map<Integer, Integer>>  essentialSubjectsScores(String subjects, Integer times, Integer scores) {
        return optionalSubjectsScores;
    }
    public  Map<String, Map<Integer, Integer>>  optionalSubjectsScores() {
        return optionalSubjectsScores;
    }
}
