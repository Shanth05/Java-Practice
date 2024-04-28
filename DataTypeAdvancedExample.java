public class DataTypeAdvancedExample {
    public static void main(String[] args) {
        int a = 10;
        double b = 4.5;
        // boolean isTrue = true;
        char letter = 'C';

        double result = a + b;
        boolean isEqual = (a == b);
        int asciiValue = (int) letter;

        System.out.println("Result: " + result);
        System.out.println("isEqual: " + isEqual);
        System.out.println("Ascii value of 'C': " + asciiValue);

        // Corrected conversion
        String str = "3.14";
        double validResult = Double.parseDouble(str);
        System.out.println("Valid Result: " + validResult);
    }
}
