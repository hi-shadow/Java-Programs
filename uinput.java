
import java.util.Scanner;

public class uinput{

    public static void main(String[] args)
    {
        Scanner hg = new Scanner(System.in);
        System.out.println("Enter Your Subjects Marks In Below");
        System.out.println("Enter Your First Subject Mark");
        int a=hg.nextInt();
        System.out.println("Enter Your Second Subject Marks");
        int b=hg.nextInt();
        System.out.println("Enter Your Third Subject Marks");
        int c=hg.nextInt();
        System.out.println("Enter Your Fourth Subject");
        int d=hg.nextInt();

        int e= (a+b+c+d)/4;
        System.out.println("Your Percentage is  "+e);
    }
}
