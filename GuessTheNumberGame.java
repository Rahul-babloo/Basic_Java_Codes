import java.util.Random;
import javax.swing.JOptionPane;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 5;
        int score = 0;

        Random random = new Random();
        int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;

        boolean guessedCorrectly = false;
        int attempts = 0;

        while (!guessedCorrectly && attempts < maxAttempts) {
            String userInput = JOptionPane.showInputDialog(null,
                    "Guess the number between " + minRange + " and " + maxRange);
            int guessedNumber = Integer.parseInt(userInput);

            if (guessedNumber == generatedNumber) {
                guessedCorrectly = true;
                score += maxAttempts - attempts;
                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the correct number!");
            } else if (guessedNumber < generatedNumber) {
                attempts++;
                JOptionPane.showMessageDialog(null, "Wrong guess! The number is higher.");
            } else {
                attempts++;
                JOptionPane.showMessageDialog(null, "Wrong guess! The number is lower.");
            }
        }

        if (!guessedCorrectly) {
            JOptionPane.showMessageDialog(null, "Sorry, you ran out of attempts. The number was " + generatedNumber);
        }

        JOptionPane.showMessageDialog(null, "Your score is: " + score);
    }
}