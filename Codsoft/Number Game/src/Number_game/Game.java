package Number_game;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private int number;
    private int attempts;
    private Scanner sc;

    public Game() {
        sc = new Scanner(System.in);
        Random rand = new Random();
        number = rand.nextInt(100) + 1;
        attempts = 5;
    }
        public boolean playRound () {
            System.out.println("\nGuess No between no 1 to 100");
            System.out.println("You have " + attempts + " attempts");

            while(attempts>0){
                System.out.println("Enter Guess: ");
                int guess = sc.nextInt();

                if (guess ==number){
                    System.out.println("Correct");
                    return true;
                }
                else if (guess>number){
                    System.out.println("too high");
                }
                else {
                    System.out.println("too low");
                }
                attempts --;
                System.out.println("Attempts Left: "+ attempts);
            }
            System.out.println("YOu LOST! number was: "+ number);
            return false;
        }

        public boolean AskplayAgain(){
            System.out.println("PlayAgain(y/n): ");
            char ch = sc.next().charAt(0);
            return ch == 'y'|| ch=='Y';
        }
}
