import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    System.out.print("Balance (with comma): ");
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();

        double betting_loops = balance / 0.95;
        System.out.println("\nNumber of betting loops: " + (int)betting_loops);
        int number_of_1_11 = (int)betting_loops * 8;
        System.out.println("Number of bets (1.11): " + number_of_1_11);
        int number_of_6_50 = (int)betting_loops;
        System.out.println("Number of bets (6.50): " + number_of_6_50);

        System.out.println("\nVerification");
        int total_no_bets = number_of_1_11 + number_of_6_50;
        System.out.println("Total number of bets: " + total_no_bets);
        System.out.println("Is " + total_no_bets + " multiple of 9?");
        double division_bets_nine = total_no_bets/9;
        System.out.println(total_no_bets + " / 9 = " + division_bets_nine);

        System.out.println("\nExpected Profit in 2 scenarios");
        System.out.println("Stake 1.11 wins: " + (int)betting_loops * 0.01);
        System.out.println("Stake 6.50 wins: " + (int)betting_loops * 0.03);



    }
}
