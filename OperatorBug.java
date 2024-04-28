public class OperatorBug {
    public static void main(String[] args) {
        int a = 5;
       // int b = 3;
        try {
            int division = a / 0;
            System.out.println("Division: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        }
    }
}
