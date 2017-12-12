import java.util.Scanner;
public class EnterPin 
{
	public static void main(String [] args)
	{
		Scanner k=new Scanner(System.in);
		int pin=12345;
		
		System.out.println("Welcom to the bank of Michell.");
		System.out.print("Enter your pin: ");
		int entry=k.nextInt();
		
		while (entry!=pin)
		{
			System.out.println("\nIncorrect pin. Try again.");
			System.out.print("Enter your pin: ");
			entry = k.nextInt();
		}
		System.out.println("\nPin accepted. You now have access to your account.");
	}

}
