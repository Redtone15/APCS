package Cls05;

public class Coin_test {
    public static class Coin_Test {
        public static void main(String[] args) {
            Coin test = new Coin("cent",0);
            Coin test2 = new Coin("nickel",1);

            test.showFace();
            test2.showFace();

            test.flip();
            test.showFace();
            test2.showFace();
            System.out.println(test);

        }
    }
}
