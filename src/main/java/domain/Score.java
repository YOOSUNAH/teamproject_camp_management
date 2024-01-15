package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Score {


    Map<Integer,ArrayList<ArrayList<String>>> Scores= new HashMap<>();



    public void RecordScore(){
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 고유 번호 입력:");
        Integer ID = sc.nextInt();
        System.out.print("과목 입력:");
        String Subject=sc.next();
        int Sub = Convert(Subject);
        System.out.print("회차 입력:");
        int times = sc.nextInt();
        System.out.print("점수 입력:");
        String Score = sc.next();

        ArrayList<ArrayList<String>>temp=Scores.get(ID);
        ArrayList<String> temp2 = temp.get(Sub);
        temp2.set(times-1,Score);
        temp.set(Sub,temp2);

        Scores.put(ID,temp);



    }

    public void setInitialScoreData(Integer ID){
        ArrayList<ArrayList<String>> ScoreData= new ArrayList<>();
        ArrayList<String> Java =new ArrayList<>();
        ArrayList<String> OOP =new ArrayList<>();
        ArrayList<String> Spring =new ArrayList<>();
        ArrayList<String> JPA =new ArrayList<>();
        ArrayList<String> MySQL =new ArrayList<>();
        ArrayList<String> DesignPattern =new ArrayList<>();
        ArrayList<String> SpringSecurity =new ArrayList<>();
        ArrayList<String> Redis =new ArrayList<>();
        ArrayList<String> MongoDB =new ArrayList<>();
        for(int i=0;i<10;i++){
            Java.add(null);OOP.add(null);Spring.add(null);JPA.add(null);MySQL.add(null);
            DesignPattern.add(null);SpringSecurity.add(null);Redis.add(null);MongoDB.add(null);


        }
        ScoreData.add(Java);ScoreData.add(OOP);ScoreData.add(Spring);ScoreData.add(JPA);ScoreData.add(MySQL);
        ScoreData.add(DesignPattern);ScoreData.add(SpringSecurity);ScoreData.add(Redis);ScoreData.add(MongoDB);

        Scores.put(ID,ScoreData);

    }
    public int Convert(String x){
        int Subject=-1;
        while(Subject==-1) {
            switch (x) {
                case "Java":
                    Subject = 0;
                case "OOP":
                    Subject = 1;
                case "Spring":
                    Subject = 2;
                case "JPA":
                    Subject = 3;
                case "MySQL":
                    Subject = 4;
                case "DesignPattern":
                    Subject = 5;
                case "SpringSecurity":
                    Subject = 6;
                case "Redis":
                    Subject = 7;
                case "MongoDB":
                    Subject = 8;

            }
            if(Subject==-1){System.out.println("과목을 다시 입력하세요");}
        }
        return Subject;

    }

}

