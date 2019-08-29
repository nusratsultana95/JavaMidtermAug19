package test;

public class Pyramid {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int x = 8; x >= i; x--) {
                System.out.print(" ");
            }
            for (int z = 0; z <= i; z++) {
                System.out.print("* ");
            }
            System.out.println(" ");

        }

    }
}
