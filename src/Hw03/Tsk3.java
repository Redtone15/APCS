package Hw03;

public class Tsk3
{
    public static void main(String[] args)
    {
        int aliceX = 0;
        int aliceY = 0;
        int bobX = 25;
        int bobY = 10;

        for (int time = 0; time <= 90; time++)
        {
            if (aliceX == bobX && aliceY == bobY)
            {
                System.out.print("Yes");

            }

            aliceX += 2;
            aliceY += 2;
            bobX -= 2;
            bobY -= 1;
        }

        System.out.println("No");
    }
}
