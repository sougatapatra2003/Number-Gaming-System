import java.util.Random;
import java.util.Scanner;

public class NG5
{

  public static void main(String[] args) 
  {

    Random rand = new Random();
    Scanner scanner = new Scanner(System.in);
    
    int randomNumber = rand.nextInt(100) + 1;
   
    int maxAttempts = 5;
    boolean guessedCorrectly = false;
    int attempts = 0;


    while(attempts < maxAttempts && !guessedCorrectly) {
      System.out.println("Enter your guess (1-100):");
      
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
    scanner.close();
    
  }
}
