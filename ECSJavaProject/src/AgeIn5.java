import java.util.Scanner;
public class AgeIn5 
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String name;
		int age, infive, fiveago;
		
		
		System.out.println("What is your name?");
		name = keyboard.next();
		
		System.out.println("Hey there " +name+ ", how old are you?");
		age = keyboard.nextInt();
		
		infive=age+5;
		fiveago=age-5;
		
		
		System.out.println("So 5 years ago you were " +fiveago+ ", and in 5 years you will be " +infive+ ", cool!");
		keyboard.close();
		
	}

}
