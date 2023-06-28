package controlStatement;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int n = scanner.nextInt();
        pyramid(n);
    }
    static void pyramid(int n){
        if (n < 1) {
            System.out.println("Can not create pyramid with this number!");
        }
        else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
