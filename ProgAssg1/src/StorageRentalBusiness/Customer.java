package StorageRentalBusiness;

import java.util.Scanner;

public class Customer {  //User Define Class
	
	private String custName;
	private int age;
	private int custPhoneNum;
	private char gender;
	
	Scanner in = new Scanner(System.in);  //Pre-Define Class
	
	public Customer() {  //constructor with no argument
		System.out.print("Please enter customer's name :");
		this.custName = in.next();
		System.out.print("Please enter customer's age :");
		this.age = in.nextInt();
		System.out.print("Please enter customer's phone number :");
		this.custPhoneNum = in.nextInt();
		System.out.print("Please enter customer's gender (m/f):");
		this.gender = in.next().charAt(0);
	}
	
	public void printInfo() {
		System.out.println("\n-------Customer's Details-------");
		System.out.println("Customer's name :"+this.custName);
		System.out.println("Customer's age :"+this.age);
		System.out.println("Customer's phone number :"+this.custPhoneNum);
		System.out.println("Customer's gender :"+this.gender);
	}

}
