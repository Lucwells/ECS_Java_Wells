import java.util.Scanner;
public class CollatzSequence 
{
	public static void main(String [] args)
	{
		Scanner k = new Scanner(System.in);
		int num;
		System.out.println("Let's creat a Collatz Sequence!");
		System.out.println("");
		System.out.println("Rules:");
		System.out.println("1. If you number is even, divide it by two.");
		System.out.println("2. If your number is odd, multiply it by 3 and add 1.");
		System.out.println("3. Repeat the first two rules until your number is 1.");
		System.out.println("");
		System.out.println("Starting number: ");
		num=k.nextInt();
		System.out.print(num+"-");
		do
		{
			if(num %2 != 0)
			{
				num=num*3+1;
				System.out.print(num+"-");
			}
			else if (num %2 == 0)
			{
				num=num/2;
				System.out.print(num+"-");
			}
		} while(num!=1);
	}

}
