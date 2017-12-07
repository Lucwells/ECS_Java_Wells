import java.util.Scanner;
public class SpaceBoxing 
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int weight, planet;
		
		System.out.print("Please enter you current earth weight: ");
		weight = keyboard.nextInt();
		System.out.println("");
		System.out.println("I have information for the following planets:");
		System.out.println("      1. Venus   2. Mars   3. Jupiter   ");
		System.out.println("      4. Saturn  5. Uranus 6. Neptune   ");
		System.out.print("");
		System.out.print("Which planet number are you going to visit?");
		planet = keyboard.nextInt();
		System.out.print("");
		if(planet<2&&planet>0)
		{
			System.out.print("Your weight on Venus would be " +weight*0.78+ ".");
		}
		else if(planet<3&&planet>1)
		{
			System.out.print("Your weight on Mars would be " +weight*0.39+ ".");
		}
		else if(planet<4&&planet>2)
		{
			System.out.print("Your weight on Jupiter would be " +weight*2.65+ ".");
		}
		else if(planet<5&&planet>3)
		{
			System.out.print("Your weight on Saturn would be " +weight*1.17+ ".");
		}
		else if(planet<6&&planet>4)
		{
			System.out.print("Your weight on Uranus would be " +weight*1.05+ ".");
		}
		else if(planet<7&&planet>5)
		{
			System.out.print("Your weight on Neptune would be " +weight*1.23+ ".");
		}
		
	}

}
