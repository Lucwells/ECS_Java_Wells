package VariablesAssignment;

public class MoreVariablesAndPrinting 
{
	public static void main(String[] args)
	{
		
	
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		double myHeight2, myWeight2;
	
		myName="Zed A. Shaw";
		myAge=35;   //A lie
		myHeight=73;  //Inches
		myWeight=155;  //lbs 	
		myEyes="assorted colors";  //Green Blue Brown Grey
		myTeeth="white";
		myHair="strawberry blonde";  //Mostly when I grow out my hair
		myHeight2=185.42;
		myWeight2=70.37;
		
		System.out.println("Let's talk about " + myName + ".");
		System.out.println("He's " + myHeight + " (or " + myHeight2 + "cm) inches tall.");
		System.out.println("He's " + myWeight + " (or " + myWeight2 + " kg) pounds heavy.");
		System.out.println("Actually that's not too heavy.");
		System.out.println("He's got " + myEyes + " eyes and " + myHair + " hair.");
		System.out.println("His teeth are usually " + myTeeth + " depending on the coffee.");
		System.out.println("If I add " + myAge + ", " + myHeight + ", and " + myHeight + " I get " + (myAge + myWeight + myHeight) + ".");
		
		
	
	
	}
}
