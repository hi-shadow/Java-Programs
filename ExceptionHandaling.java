import java.util.Scanner;

public class ExceptionHandaling {
    public static void main(String[] args) {
        int a, b, c = 0;
    try (Scanner sc = new Scanner(System.in)) { 
            System.out.println("Enter A First Number");
            a = sc.nextInt();
            System.out.println("Enter A Second Number");
            b = sc.nextInt();
        }
        try {
            c = a / b;
            System.out.println("The Devided Result Is : " + c);

        } catch (ArithmeticException e) {
            System.out.println("Exception Occurs");
            System.out.println(e);
        } finally {
            System.out.println("This Is A Finally Block");
        }

    }

}
