public class DataTypeBug { 
    public static void main(String[] args) { 
        int a = 10;  
        double b = 4.5; 
        boolean isTrue = true; 
        char letter = 'C'; 
        double result = a + b; 
        boolean isEqual = (a == b); 
        int asciiValue = isTrue ? 1 : 0; // Convert boolean to int
         
        System.out.println("Result: " + result); 
        System.out.println("isEqual: " + isEqual); 
        System.out.println("Ascii value of 'C': " + (int) letter); 
        System.out.println("Boolean to int: " + asciiValue); 
    } 
}
