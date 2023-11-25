package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int row = 1; row <= cathetusLength; row++) {
            for (int space = 1; space <= cathetusLength - row; space++) {
                System.out.print(" ");
            }
            for (int dec = row; dec >= 1; dec--) {
                System.out.print(dec);
            }
            for (int inc = 2; inc <= row; inc++) {
                System.out.print(inc);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
