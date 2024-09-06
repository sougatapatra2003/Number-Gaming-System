import java.util.Random;
import java.util.Scanner;

public class NG6
{

  public static void main(String[] args) 
  {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    
    int min = 1;
    int max = 100;
   
    int maxAttempts = 5;
    boolean playAgain = true;
    while (playAgain) {
        int randomNumber = random.nextInt(max - min + 1) + min;
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("Guess the random number between " + min + " and " + max + ".");

        while (attempts < maxAttempts && !guessedCorrectly) {
            System.out.print("Attempt " + (attempts + 1) + ": ");
            int playerGuess = scanner.nextInt();
            attempts++;
            if (playerGuess == randomNumber) 
      {
        System.out.println("Correct! You Win!");
        System.out.println("It took you " + attempts + " tries");
        break;
      }
      else if(randomNumber > playerGuess) 
      {
        System.out.println("Nope! The number is higher. Guess again.");
      }
      else 
      {
        System.out.println("Nope! The number is lower. Guess again.");
      }
    }
    if (!guessedCorrectly) {
        System.out.println("Sorry, you've reached the maximum number of attempts.");
        System.out.println("The correct number was: " + randomNumber);
    }

    System.out.print("Do you want to play again? (yes/no): ");
    String playAgainInput = scanner.next();
    playAgain = playAgainInput.equalsIgnoreCase("yes");
    System.out.println();
}

scanner.close();
}
}
    
