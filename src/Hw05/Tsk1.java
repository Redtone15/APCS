package Hw05;

public class Tsk1 {
    private String name;
    private String id;
    private int points;
    public Tsk1(String name1, String id1, int points1){
        name=name1;
        points=points1;
        id=id1;
    }
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public int getPoints(){
        return points;
    }
    public void setPoints(int amount){
        points = amount;

    }
    public String toString(){
        return name + " " + points + " " + id;
    }

}
