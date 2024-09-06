import java.util.Random;
import java.util.*;

public class NG2 {
    public static void main(String[] args) {
        int answer, guess;
        final int MAX = 10;

        Scanner Sc = new Scanner(System.in);
        Random rand = new Random();

        answer = rand.nextInt(MAX) + 1;

        System.out.println("Guess a number between 1 and 10");
        guess = Sc.nextInt();

        if (guess == answer) {
            System.out.println("Good job, the number was " + answer);

        } else {
            System.out.println("Sorry but the number was " + answer);
        }

    }

}
