package controlStatement;

public class Bai3 {
    public static void main(String[] args) {
        int result = isLeapYear(2000);
        if (result == 0){
            System.out.println("Not leap year");
        }else {
            System.out.println("Leap year");
        }
    }
    static int isLeapYear(int year){
        if (year % 4 == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
