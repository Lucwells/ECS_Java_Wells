import java.util.Scanner;
public class UserInputofData 
{
	public static void main(String [] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name, lastname, login;
		int grade, id;
		double gpa;
		System.out.println("Type in your info so I can sell it");
		System.out.println("");
		System.out.print("First Name: ");
		name = keyboard.next();
		System.out.print("Last Name: ");
		lastname = keyboard.next();
		System.out.print("Grade(9-12): ");
		grade = keyboard.nextInt();
		System.out.print("Student ID: ");
		id = keyboard.nextInt();
		System.out.print("Student Login: ");
		login = keyboard.next();
		System.out.print("GPA (0.0-4.0): ");
		gpa = keyboard.nextDouble();
		System.out.println("");
		
		System.out.println("Your Information");
		System.out.println("Login: " +login+ "");
		System.out.println("ID: " +login+ "");
		System.out.println("Name: " +lastname+ ", " +name+ "");
		System.out.println("GPA: " +gpa+ "");
		System.out.println("Grade: " +grade+ "");
		
		
		
	}
}