import java.util.Scanner;
public class NameAgeSalary
{
	public static void main(String [] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age, salary;
		
		System.out.println("Hey there, what's your name?");
		name = keyboard.next();
		System.out.println("Hi " +name+ ", how old are you?");
		age = keyboard.nextInt();
		System.out.println("So you are " +age+ ", not too bad. How much money do you make per year?");
		salary = keyboard.nextInt();
		System.out.println("Dang, that's not a lot of money for your age.");
		
		keyboard.close();
		
	}

}
