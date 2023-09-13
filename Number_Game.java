package Codesoft;
import java.util.*;

public class Number_Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;

        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;

        System.out.println("\t\tWelcome to the World of Guesses !!!!!");
        System.out.println();
        System.out.println("\tThe number has been Chosen between the range 1 to 100");
        System.out.println("\t\tNow it's your turn to guessed it right");
        System.out.println();
        System.out.println("******************************* Let Fun Begin *******************************");
        int tries = 0;
        boolean GuessedRight = false;
        
        while(!GuessedRight){
            
            System.out.println("Enter Guess : ");
            int userAns = scan.nextInt();
            tries++;

            if(userAns < randomNumber){
                System.out.println("Your Guess is less try some higher number");
                System.out.println();
            }
            if(userAns > randomNumber){
                System.out.println("Your Guess is more try some lower number");
                System.out.println();
            }
            if(userAns == randomNumber){
                System.out.println("\tBRAVO!! CONGRAJULATIONS!!!! You Guessed it right");
                System.out.println("\tThe number was "+randomNumber+" and you gussed it right in "+ tries + "th try\n");
                System.out.println("***********************************************************************************************");
                break;
            }
        }
        
    }
}
