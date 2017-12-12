import java.util.Scanner;
public class TwoQuestions 
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String q1, q2;
		
		System.out.println("Think of an object and I'll guess what it is.");
		System.out.println("");
		System.out.println("Is the object an animal, a vegetable, or a mineral?");
		q1=keyboard.next();
		System.out.println("");
		System.out.println("Is your object bigger or smaller than a breadbox?");
		q2=keyboard.next();
		
		if(q1.equals("animal") && q2.equals("bigger"))
		{
			System.out.println("Is your object a moose?");
		}
		else if(q1.equals("animal") && q2.equals("smaller"))
		{
			System.out.println("Is your object a squirrel?");
		}
		else if(q1.equals("vegetable") && q2.equals("bigger"))
		{
			System.out.println("Is your object a watermelon?");
		}
		else if(q1.equals("vegetable") && q2.equals("smaller"))
		{
			System.out.println("Is your object a carrot?");
		}
		else if(q1.equals("mineral") && q2.equals("bigger"))
		{
			System.out.println("Is your object a paper clip?");
		}
		else if(q1.equals("mineral") && q2.equals("smaller"))
		{
			System.out.println("Is your object camaro?");
		}
	}
}
