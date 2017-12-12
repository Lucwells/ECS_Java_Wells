import java.util.Scanner;
public class CountingMachine 
{
	public static void main(String [] args)
	{
		Scanner k = new Scanner(System.in);
		
		System.out.println("Count to: ");
		int number = k.nextInt();
		
		for (int n=0; n <= number; n++)
		{
			System.out.print(n+ " ");
		}
		
	}

}
