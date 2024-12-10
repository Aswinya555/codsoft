import java.util.Scanner;
import java.util.Random;

public class numbergame {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        
        System.out.println("Welcome to Guess The Number Game!");
        int totalScore = 0;
        boolean continuePlaying = true;

        while (continuePlaying) {
            int secretNumber = randomGenerator.nextInt(100) + 1; 
            int attemptsMade = 0;
            int maxAttemptsAllowed = 5;
            System.out.println("I have chosen a number between 1 and 100. Can you guess it?");
            
            while (attemptsMade < maxAttemptsAllowed) {
                System.out.print("Enter your guess: ");
                int playerGuess = inputScanner.nextInt();
                inputScanner.nextLine(); 
                attemptsMade++;

                if (playerGuess == secretNumber) {
                    System.out.println("Well done! You guessed the number " + secretNumber + " in " + attemptsMade + " attempts.");
                    totalScore++;
                    break;
                } else if (playerGuess < secretNumber) {
                    System.out.println("Your guess is too low. Try again!");
                } else {
                    System.out.println("Your guess is too high. Try again!");
                }
            }
            
            if (attemptsMade >= maxAttemptsAllowed) {
                System.out.println("Sorry, you've used all attempts. The correct number was " + secretNumber + ".");
            }

            System.out.print("Would you like to play another round? (yes/no): ");
            String response = inputScanner.nextLine();
            continuePlaying = response.equalsIgnoreCase("yes");
        }

        System.out.println("Game over! Your final score is: " + totalScore);
        inputScanner.close();
    }
}
