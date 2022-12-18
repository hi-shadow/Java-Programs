import java.util.Scanner;

class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  X : ");
        int x = sc.nextInt();
        System.out.println("Enter   Y : ");
        int y = sc.nextInt();

        if ((x / 2 == 0) && (y / 2 == 0)) {
            System.out.println("X is Even");
            System.out.println("Y is Even");
        }

        else if ((x / 2 == 1) && (y / 2 == 1)) {
            System.out.println("X is Odd");
            System.out.println("Y is Odd");
        }

        else if ((x / 2 == 1) && (y / 2 == 0)) {
            System.out.println("X is Odd");
            System.out.println("Y is Even");
        }

        else if ((x / 2 == 0) && (y / 2 == 1)) {
            System.out.println("X is Even");
            System.out.println("Y is Odd");
        } else {
            System.out.println("hahaha");
        }

    }
}