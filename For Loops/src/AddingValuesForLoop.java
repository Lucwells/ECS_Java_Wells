import java.util.Scanner;
public class AddingValuesForLoop
{
	public static void main(String [] args)
	{
		Scanner k = new Scanner(System.in);
		int temp;
		temp=0;
		System.out.println("Number: ");
		int number = k.nextInt();
		for (int ttl=0, n=0; n<=number; ttl=ttl+n, n++)
		{
			System.out.print(n+" ");
			temp=ttl;
		}
		temp=temp+number;
		System.out.println("The total is " +temp);
	}

}