import java.util.Scanner;
public class HowOldSpecifically 
{
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("What is your name? ");
		name = keyboard.next();
		System.out.print("Hey " +name+ ", how old are you? ");
		age = keyboard.nextInt();
		
		if (age<16)
		{
			System.out.print("You can't drive, " +name+ ".");
		}
		else if (age<18&&age>15)
		{
			System.out.print("You can drive but not vote, " +name+ ".");
		}
		else if (age<25&&age>17)
		{
			System.out.print("You can vote but not rent a car, " +name+ ".");
		}
		else if (age<24||age>25)
		{
			System.out.print("You can do almost anything you want, " +name+ ".");
		}
	}

}
