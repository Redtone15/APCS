package Cls06;

import java.util.*;

class GuessingGame
{
    private String word;
    private String guess;
    private int count;

    public GuessingGame(String w)
    {
        word = w;
        guess = "";
        for (int i=0; i<w.length(); i++)
            guess += "_";
        count = 0;
    }

    public void play()
    {
        Scanner s = new Scanner(System.in);
        while (!guess.equals(word))
        {
            System.out.println("Enter a letter");
            String c = s.nextLine();
            updateGuess(c);
            System.out.println(guess);
            count++;
        }
        System.out.println("You've guessed " + count + " times"); 
    }

    public void updateGuess(String c) 
    {
        /* to be completed */
    }

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a word to guess:"); 
        String word = s.nextLine();
        GuessingGame game = new GuessingGame(word);
        game.play();
    }
}
