import java.util.Scanner;
import java.util.Random;
public class NumbGuessCount
{
	public static void main(String [] args)
	{
		Scanner k=new Scanner(System.in);
		Random r=new Random();
		int num, guess, n;
		num=1+r.nextInt(9);
		System.out.println("I am guessing a number from 1-10. Try to guess it.");
		System.out.println("Your guess is ");
		guess=k.nextInt();
		n=1;
		do
		{
		System.out.println("Wrong, guess again. ");
		System.out.println("Your guess is ");
		guess=k.nextInt();
		n++;
		}while (guess!=num);
		System.out.println("Good job, you got it in " +n+ " tries.");
	}

}
