package Cls05;

public class Coin
{
    private String name;
    private int face;

    public Coin(){

    }
    public Coin(String name1, int face1){
        name = name1;
        face = face1;
    }
    public void flip(){
        face = (int)(Math.random()*2);

    }
    public boolean isHeads(){
        return face == 0;
    }
    public void showFace(){
        if(isHeads()) {
            System.out.println("Coin" + name + "Heads");

        }else{
            System.out.println("Coin" + name + "Tails");
        }
    }
}
