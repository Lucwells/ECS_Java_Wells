//This assignment uses given variables to make a story
package VariablesAssignment;

public class VariablesAndNames
{
	public static void main( String[] args )
	{
		int cars, drivers, passengers, cars_not_driven, cars_driven;
		double space_in_a_car, carpool_capacity, average_passengers_per_car;
		//When I used just 4, I got the same results as 4.0
		cars=100 ;
		space_in_a_car=4;
		drivers=30 ;
		passengers=90 ;
		cars_not_driven= cars - drivers;
		cars_driven=drivers;
		carpool_capacity=cars_driven * space_in_a_car;
		average_passengers_per_car=passengers/cars_driven;
		//= sets a variable to a number, while == checks if two operands are equal
		
		System.out.println("There are " + cars + " cars avaible.");
		System.out.println("There are only " + drivers + " drivers avaible.");
		System.out.println("There will be " + cars_not_driven + " empty cars today.");
		System.out.println("We can transport " + carpool_capacity + " people today.");
		System.out.println("We have " + passengers + " to carpool today.");
		System.out.println("We need to put about " + average_passengers_per_car + " in each car.");
		
	}

}
