package StorageRentalBusiness;

import java.util.Scanner;

public class Employee {

	private String employName;
	private int age;
	private int employPhoneNum;
	private String employAddress;
	
	Scanner in = new Scanner(System.in);
	
	public Employee() {  //constructor with 0 argument
		System.out.print("Please enter employee's name: ");
		this.employName = in.next();
		System.out.print("Please enter employee's age: ");
		this.age = in.nextInt();
		System.out.print("Please enter employee's phone number: ");
		this.employPhoneNum = in.nextInt();
		System.out.print("Please enter employee's address: ");
		this.employAddress = in.next()+in.nextLine();
	}
	
	public void printInfo() {
		System.out.println("\nEmployee's name :"+this.employName+
							"\nEmployee's age :"+this.age+
							"\nEmployee's phone number :"+this.employPhoneNum+
							"\nEmployee's address :"+this.employAddress);
	}
}
