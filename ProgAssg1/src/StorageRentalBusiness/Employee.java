package StorageRentalBusiness;

import java.util.Scanner;

public class Employee {

	private String employName;
	private int age;
	private int employPhoneNum;
	private String position;
	private char gender;
	private double salary;
	private double epf;
	
	Scanner in = new Scanner(System.in);  //Pre-Define Class
	
	public Employee() {  //constructor with no argument
		System.out.print("Please enter employee's name: ");
		this.employName = in.next();
		System.out.print("Please enter employee's age: ");
		this.age = in.nextInt();
		System.out.print("Please enter employee's phone number: ");
		this.employPhoneNum = in.nextInt();
		System.out.print("Please enter employee's position: ");
		this.position = in.next()+in.nextLine();
		System.out.print("Please enter employee's gender (m/f): ");
		this.gender = in.next().charAt(0);
		System.out.print("Please enter employee's salary: ");
		this.salary = in.nextDouble();
		System.out.print("Please enter EPF rate: ");;
		this.epf = in.nextDouble();
		
		if(position.equals("salesman")) {
			System.out.println("\n----------Displaying Employee's Info----------");
			System.out.println("Employee's name\t\t:"+this.employName);
			System.out.println("Employee's age\t\t:"+this.age);
			System.out.println("Employee's phone number\t:"+this.employPhoneNum);
			System.out.println("Employee's position\t:"+this.position);
			System.out.println("Employee's gender\t:"+this.gender);
			System.out.println("Employee's salary\t:RM"+this.salary);
			System.out.println("Epf\t\t\t:"+epf*100+"%");
			System.out.println("Employee's salary paid\t:RM"+totalPaid());
		}
		else {
			double elaun = 500;
			System.out.println("\n----------Displaying Employee's Info----------");
			System.out.println("Employee's name\t\t:"+this.employName);
			System.out.println("Employee's age\t\t:"+this.age);
			System.out.println("Employee's phone number\t:"+this.employPhoneNum);
			System.out.println("Employee's position\t:"+this.position);
			System.out.println("Employee's gender\t:"+this.gender);
			System.out.println("Employee's salary\t:RM"+this.salary);
			System.out.println("Elaun get\t\t:RM"+elaun);
			System.out.println("Epf\t\t\t:"+epf*100+"%");
			System.out.println("Employee's salary paid\t:RM"+totalPaid(elaun));
		}
	}
	
	public double totalPaid() {
		return salary*(1-epf);
	}
	
	public double totalPaid(double elaun) {
		return (salary+elaun)*(1-epf);
	}
	
}
