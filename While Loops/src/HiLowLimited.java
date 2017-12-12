import java.util.Random;
import java.util.Scanner;
public class HiLowLimited
{
	public static void main ( String[] args )
	{
		Random r = new Random();
		Scanner k = new Scanner(System.in);
		
		int num, num1, tries;
		tries=0;
		num1=r.nextInt(100);
        System.out.println("I'm thinking of a number between 1 and 100. Try to guess the number in 7 tries.");
        System.out.println(">");
        num=k.nextInt();
        
        while(tries<6)
        {
        	
            if(num==num1)
        	{
        		System.out.println("Wow, you got my number!");
        	}
        	else if(num>num1)
        	{
        		System.out.println("Too high, keep guessing.");
        	}
        	else
        	{
        		System.out.println("Too low, keep guessing.");
        	}
        	System.out.println(">");
            num=k.nextInt();
        	tries++;
        	
        }
	System.out.println("You ran out of tries, sorry, you lose.");
	}	
}	