package controlStatement;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        int a = sc.nextInt();
        System.out.println("Nhap b: ");
        int b = sc.nextInt();
        System.out.println(compare(a,b));
    }
    public static int compare(int a, int b) {
        return a < b ? -1 : a == b ? 0 : 1;
    }
}
