import java.util.Scanner;
public class DumbCalculator
{
	public static void main(String [] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		double fn, sn, tn, avg;
		
		System.out.println("Let's find the average of a few numbers...");
		System.out.println("");
		System.out.print("What is your first decimal number?");
		fn = keyboard.nextDouble();
		System.out.print("What is your second decimal number?");
		sn = keyboard.nextDouble();
		System.out.print("What is your third decimal number?");
		tn = keyboard.nextDouble();
		
		avg=(fn+sn+tn)/3;
		
		System.out.println("The average number is " +avg+ ".");
		keyboard.close();
	}

}
