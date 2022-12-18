
import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        String a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String Would you want to process method upon a string ");
        a=sc.nextLine();
        System.out.println("a");
        System.out.println(a.toLowerCase());  // String Converted into lower case 
        System.out.println(a.toUpperCase());    // STRING WILL BE CONVERTED INTO UPPER CASE
        System.out.println(a.length());
        System.out.println(a.equalsIgnoreCase("Ravi")); 
        System.out.println(a.length());
        System.out.println(a.equals("hello"));
    }
    
}
