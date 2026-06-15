import java.util.Random;
import java.util.Scanner;
public class Task1_NumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int number = random.nextInt(100) + 1;
        int guess;
        System.out.println("Guess a number between 1 and 100");
        do{
            System.out.print("Enter your guess:");
            guess = sc.nextInt();
            if(guess > number){
                System.out.println("TOO HIGH");
            }
            else if(guess < number){
                System.out.println("TOO LOW");
            }
            else {
                System.out.println("Congratulations! You guessed correctly.");
            }
        }
        while(guess != number);
        sc.close();
    }
}