import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Sieser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random com = new Random();

        int res;

        System.out.println();
        System.out.println("-------Rules-------");
        System.out.println("Choose One Number You Want to do");
        System.out.println("0 For ROCK");
        System.out.println("1 For PAPER");
        System.out.println("2 For SCISSOR");
        do {

            System.out.println();
            System.out.println();
            System.out.println("Enter A Number : ");
            int a = input.nextInt();
            System.out.println("You Choosed : " + a);

            if (a == 0 || a == 1 || a == 2) {

                int b = com.nextInt(3);
                System.out.println(b);
                System.out.println("Computer Choosed : " + b);
                System.out.println("____________________");

                if ((a == 0 && b == 1) || (a == 1 && b == 2) || (a == 2 && b == 0)) {

                    System.out.println("Computer Wins..");
                    System.out.println();
                } else if ((a == 0 && b == 2) || (a == 1 && b == 0) || (a == 2 && b == 1)) {

                    System.out.println("You Wins..");
                    System.out.println();
                } else {
                    System.out.println("Match Tie..");
                    System.out.println();
                }

            } else {
                System.out.println("Enter A Proper Number");
            }
            System.out.println("Do you want to play again ");
            System.out.println("press 1 to restart the game");
            res = input.nextInt();
        } while (res == 1);
    }

}
