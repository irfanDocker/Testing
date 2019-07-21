package javaClass;

import java.util.Scanner;

public class JavaProgram {
	public static void main(String[] args) {
		
		Scanner taskScanner = new Scanner(System.in);

		System.out.println("Welcome To TechCircle Registeration Page");
		
		System.out.println("Please Enter your First Name");
		String firstname = taskScanner.nextLine();
		
		System.out.println("Please Enter your Last Name");
		String lastname = taskScanner.nextLine();
		
		System.out.println("Please Enter your Home Address");
		String homeaddress = taskScanner.nextLine();
		
		System.out.println("Please Enter your Date of Birth");
		String dateofbirth = taskScanner.nextLine();
	
		System.out.println("Please Enter your Phone Number");
		long phonenumber = taskScanner.nextLong();
				
		System.out.println("Please Enter your Height");
		double yourHeight = taskScanner.nextDouble();
		
		System.out.println("Are you Superman");
		boolean superman = taskScanner.nextBoolean();
		
		taskScanner.close();

	
	//Ask for users first and lastname
		System.out.println("Your full name is: "+firstname + " " + lastname);
	
	//Ask for users date of birth
		System.out.println("Your DOB is:" +dateofbirth);
	
	//Ask for User Phone Number
		System.out.println("Your phone number is:" +phonenumber);
		
	//Ask for Height
		System.out.println("Your Height is:" +yourHeight);
		
	//Ask if he/she is superman
		System.out.println("Are you superman:" +superman);	
		
	//Ask if he/she is superman
		System.out.println("Your home address is :" +homeaddress);
	
	
	}
}