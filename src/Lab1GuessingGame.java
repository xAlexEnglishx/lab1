import java.util.Random;
import java.util.Scanner;


public class Lab1GuessingGame {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		Random rand = new Random();
	    int randomNum = rand.nextInt(10) + 1;
		
		System.out.print("What number am I thinking of between 1 and 10?\n");
		int userGuess = input.nextInt();
		
		if(userGuess == randomNum){
			System.out.println("You guessed it!");
		}else{
			System.out.println("Wrong! The answer is " + randomNum);
		}
	}
}
