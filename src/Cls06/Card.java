package Cls06;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class
Card extends JFrame implements ActionListener
{ 

    private int count;

    public Card()
    {
        super("Flashing Card");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	JButton card = new JButton("A");
        card.addActionListener(this);
        add(card);

    	Font font = new Font("Times New Roman", Font.BOLD, 400);
        card.setFont(font);
        setVisible(true);

		count = 1;
    }

    public void actionPerformed(ActionEvent evt)
    {
        JButton source = (JButton) evt.getSource();
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

//      the lines below needs work
        String st = letters.substring(count, count+1);
        source.setText(st);


        source.setText(st);

        count++;
        count %= 26;
    }

	public static void main(String[] args)
	{
		Card c = new Card();
	}
}
