package Method.Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    //Calculate:
    //Demo: add
    public int add(int a, int b) {
        return a + b;
    }

    // 1. Divide
    public void divide(double a, double b) { //throws
        if (b == 0) {
            System.out.println("Denominator can not be 0");
        } else {
            System.out.println("a / b = " + a / b);
        }
    }

    // 2.Get first char of string:
    public void getFirstCharOfString(String s) {
        if (s == "") {
            System.out.println("Can not find because input string is null");
        }
        System.out.println("First char of input string is: " + s.charAt(0));
    }

    // 3.Check is even:
    public boolean isEven(int a) {
        return a % 2 == 0 ? true : false;
    }

    // 4. Sum of 2 short:
    public short addShort(short a, short b) {
        return (short) (a + b);
    }

    // 5. Calculate Factorial
    public double factorial(int a) { //should return something if input number is too big
        double f = 1;
        if (a == 0) {
            return 1;
        }
        for (double i = 1; i <= a; i++) {
            f *= i;
        }
        return f;
    }

    // 6. Calculate Average
    public void average() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of elements = ");
        int n = scanner.nextInt();
        double s = 0;
        for (int i = 1; i < n + 1; i++) {
            System.out.print("Input number no." + i + " :");
            s += scanner.nextInt();
        }
        System.out.println("Average = " + s / n);
    }

    // 7. Find max of 2 Interger number
    public int findMax(int a, int b) {
        return a >= b ? a : b;
    }

    // 8. Tính cạnh huyền của tam giác vuông (tham số là 2 cạnh góc vuông)
    public double hypotenuse(double a, double b) { //bắt lỗi số âm
        if (a < 0 || b < 0) {
            System.out.println("Right triangle edges can not be negative");
        }
        return Math.sqrt(a * a + b * b);
    }

    // 9. Get the last char of a string
    public char lastChar(String s) {
        return s.charAt(s.length() - 1);
    }

    // 10. Draw pyramid
    public void drawPyramid() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of levels: ");
        int n = scanner.nextInt();
        int maxStar = n * 2 - 1;
        for (int i = 1; i <= maxStar; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                String space = "";
                int numberOfSpace = (maxStar - i) / 2;
                for (int j = 1; j <= numberOfSpace; j++) {
                    space += " ";
                }
                String star = "";
                for (int k = 1; k <= i; k++) {
                    star += "*";
                }
                System.out.println(space + star);
            }
        }
    }
}
