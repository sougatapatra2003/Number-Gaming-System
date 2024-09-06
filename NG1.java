import java.util.Random;

public class NG1 
{
    public static void main(String[] args) 
    {
        int min = 1,max = 100;  // Minimum Maximum value of the range
         

        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);
    }
}
