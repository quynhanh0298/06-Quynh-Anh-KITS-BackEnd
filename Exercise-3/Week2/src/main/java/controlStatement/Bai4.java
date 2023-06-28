package controlStatement;

public class Bai4 {
    public static void main(String[] args) {
        printEven(9);
    }

    static void printEven(int n) {
        if (n < 0) {
            System.out.println("Invalid Number!");
        } else {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
