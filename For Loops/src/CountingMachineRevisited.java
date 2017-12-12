import java.util.Scanner;
public class CountingMachineRevisited 
{
	public static void main(String [] args)
	{
		Scanner k = new Scanner(System.in);
		
		System.out.println("Count from: ");
		int start = k.nextInt();
		System.out.println("Count by: ");
		int by = k.nextInt();
		System.out.println("Count to: ");
		int number = k.nextInt();
		
		for (int n=start; n <= number; n=n+by)
		{
			System.out.print(n+ " ");
		}
		
	}

}
