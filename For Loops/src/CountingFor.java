import java.util.Scanner;
public class CountingFor 
{
	public static void main(String[] args)
	{
		Scanner k=new Scanner(System.in);
		
		System.out.println("Type in a message and I'll display it 5 times.");
		System.out.print("Message: ");
		String message = k.nextLine();
		
		for (int n = 1 ; n <= 5 ; n = n+1)
		{
			System.out.println( n + ". " + message);
		}
	}

}
