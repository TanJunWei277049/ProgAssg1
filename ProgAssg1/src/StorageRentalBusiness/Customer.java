package StorageRentalBusiness;

import java.util.Scanner;

public class Customer {
	
	private String custName;
	private int age;
	private int custPhoneNum;
	private String address;
	private String rentDate;
	private double time;
	private int quantity;
	
	Scanner in = new Scanner(System.in);  //Pre-Define Class
	
	public Customer() {  //constructor with no argument
		System.out.print("Please enter customer's name :");
		this.custName = in.next();
		System.out.print("Please enter customer's age :");
		this.age = in.nextInt();
		System.out.print("Please enter customer's phone number :");
		this.custPhoneNum = in.nextInt();
		System.out.print("Please enter customer's address :");
		this.address = in.nextLine();
		in.nextLine();
		System.out.print("Please enter customer's rent date :");
		this.rentDate = in.next();
		System.out.print("Please enter customer's rent time :");
		this.time = in.nextDouble();
		System.out.print("Please enter customer's rent quantity :");
		this.quantity = in.nextInt();
	}
	
	public void printInfo() {
		System.out.println("\nCustomer's name :"+this.custName+
							"\nCustomer's age :"+this.age+
							"\nCustomer's phone number :"+this.custPhoneNum+
							"\nCustomer's address :"+this.address+
							"\nCustomer's rent date :"+this.rentDate+
							"\nCustomer's rent time :"+this.time+
							"\nCustomer's rent quantity :"+this.quantity);
	}

}
