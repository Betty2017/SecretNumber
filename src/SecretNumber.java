import java.util.Scanner;
import java.util.Random;
public class SecretNumber {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		
		//char choice = 'y';
		
		Random r = new Random();
		int x = 1+ r.nextInt(10);
		int number =0;
		do
			
		{
			
			System.out.println("Guess a Secret Number");
			 number = keyboard.nextInt(); 
		if (number < x){
		System.out.println("You guessed too low,try again?");
		//choice = 'y';
		}
		else if (number> x)
			{ 
		System.out.println("You guessed too high,try again?");
		//choice = 'y';
			}
		else 
		{
		System.out.println("You Guess the correct number");	
		//choice ='n';
		}
		}
		while(number != x);
	}

}
