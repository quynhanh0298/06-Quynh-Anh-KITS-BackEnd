package controlStatement;

public class Bai1 {
    public static void main(String[] args) {
        evaluate(79);
    }
    public static void evaluate(int score) {
        if (score > 100) {
            System.out.println("Invalid Score!");
        } else if (score >= 80) {
            System.out.println("A");
        } else if (score >=60) {
            System.out.println("B");
        } else if (score >= 40) {
            System.out.println("C");
        }else if (score >= 20){
            System.out.println("D");
        }else if (score >= 0){
            System.out.println("E");
        }else {
            System.out.println("Invalid Score!");
        }
    }
}
