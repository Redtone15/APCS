package Cls04;

public class Draw
{
    public Draw()
    {
    }

    public static void main(String[] var0)
    {
        for(int var1 = 3; var1 <= 8; var1 += 2)
        {
            drawTriangle(20, var1);
        }

        drawRectangle(20, 3, 9);
    }

    public static void draw(String var0, int var1)
    {
        for(int var2 = 0; var2 < var1; ++var2)
        {
            System.out.print(var0);
        }

    }

    public static void drawRectangle(int var0, int var1, int var2)
    {
        if (var1 % 2 == 1 && var0 > var1 / 2) {
            for(int var3 = 0; var3 < var2; ++var3) {
                for(int var4 = 0; var4 < var0 - 2; ++var4)
                {
                    System.out.print(" ");
                }

                if (var3 != 0 && var3 != var2 - 1)
                {
                    System.out.print("*");

                    for(int var6 = 0; var6 < var1 - 2; ++var6)
                    {
                        System.out.print(" ");
                    }

                    if (var1 > 1)
                    {
                        System.out.print("*");
                    }
                } else {
                    for(int var5 = 0; var5 < var1; ++var5)
                    {
                        System.out.print("*");
                    }
                }

                System.out.println();
            }
        }

    }

    public static void drawTriangle(int var0, int var1)
    {
        for(int var2 = 0; var2 <= var1; ++var2)
        {
            draw(" ", var0 - var2);
            draw("#", 1 + (var2 - 1) * 2);
            draw(" ", var0 - var2);
            System.out.println();
        }

    }
}
