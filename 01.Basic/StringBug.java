public class StringBug { 
    public static void main(String[] args) { 
        String str1 = "Hello"; 
        String str2 = "World"; 
        String concatenatedString = str1 + " " + str2; // Concatenate str1 and str2
       // String substring = concatenatedString.substring(0, 5); // Get substring from 0 to 5
         
        System.out.println("Concatenated String: " + concatenatedString);

    }
}
