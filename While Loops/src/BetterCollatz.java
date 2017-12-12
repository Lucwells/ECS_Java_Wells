import java.util.Scanner;
public class BetterCollatz 
{
	public static void main(String [] args)
	{
		Scanner k = new Scanner(System.in);
		int num, runs, largest;
		runs=0;
		
		System.out.println("Let's creat a Collatz Sequence!");
		System.out.println("");
		System.out.println("Rules:");
		System.out.println("1. If you number is even, divide it by two.");
		System.out.println("2. If your number is odd, multiply it by 3 and add 1.");
		System.out.println("3. Repeat the first two rules until your number is 1.");
		System.out.println("");
		System.out.println("Starting number: ");
		num=k.nextInt();
		largest=num;
		System.out.print(num+"-");
		do
		{
			if(num %2 != 0)
			{
				num=num*3+1;
				System.out.print(num+"-");
				runs++;
				if(num>largest)
				{
					largest=num;
				}
			}
			else if (num %2 == 0)
			{
				num=num/2;
				System.out.print(num+"-");
				runs++;
				if(num>largest)
				{
					largest=num;
				}
			}
		} while(num!=1);
		System.out.println("");
		System.out.println("It took " +runs+ " runs to complete the Collatz Sequence!");
		System.out.println("The highest number was "+largest+"!");
	}

}
