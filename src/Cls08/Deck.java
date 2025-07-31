package Cls08;

public class Deck {
    private int[] myDeck;
    public static final int NUMCARDS = 52;

    public Deck(){
        myDeck = new int[NUMCARDS];
        for(int i = 0; i<NUMCARDS; i++){
            myDeck[i] = i;
        }
    }
    public void writeDeck(){
        Array.print(myDeck);
    }
    private void swap(int i, int j){
        Array.swap(myDeck, i, j);
    }
    public void shuffle(){

        for(int i = NUMCARDS-1; i>0; i--){
            int j = (int)(Math.random()*(i+1));
            swap(i, j);
        }

    }
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.writeDeck();
        deck.shuffle();
        deck.writeDeck();
    }

}
