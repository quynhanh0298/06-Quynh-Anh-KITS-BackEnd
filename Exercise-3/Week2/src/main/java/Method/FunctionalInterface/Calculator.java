package Method.FunctionalInterface;

public class Calculator {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b; //This is called lambda expression
        int result = addition.operate(3,4);
        System.out.println("Result: " + result);
    }
}
