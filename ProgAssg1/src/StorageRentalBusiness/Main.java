package StorageRentalBusiness;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int option;
		
		Scanner in = new Scanner(System.in);  //Pre-Define Class
		
		StorageRentalBusiness srb = new StorageRentalBusiness("Tan Storage Rental Company");
		
		srb.setBusinessTime("10 a.m. to 5 p.m.");
		srb.setPhoneNum(32501032);
		
		System.out.println("----------Welcome To "+srb.getCompanyName()+"----------");
		System.out.println("Business hour\t :"+srb.getBusinessTime());
		System.out.println("Please contact\t :"+srb.getPhoneNum());
		
		System.out.println("\nYou can choose from the following option:-");
		System.out.println("\n1. Product Description \n2. Storage Sales Price \n3. Customer \n4. Financial Report \n5. Advertisement \n6. Employee \n");
		
		System.out.print("Please enter your option: ");
		option = in.nextInt();
		
		if(option == 1) {
			ProductDescription product = new ProductDescription();
			product.setLocation("Klang");
			product.setPrice(30);
			product.setStorageSize(65);
			
			System.out.println("\nLocation \t: "+product.getLocation());
			System.out.println("Price \t\t: RM"+product.getPrice()+" per square feet");
			System.out.println("Storage Size \t: "+product.getStorageSize()+" square feet");
		}
		else if(option == 2) {
			Sales s = new Sales(30,65);
		}
		else if(option == 3) {
			Customer c = new Customer();
			c.printInfo();
		}
		else if(option == 4) {
			Finance f = new Finance(20000,2000,3500,1000,1000);
			System.out.println("\nTotal Expenses\t: Rm"+f.calTotalExpenses());
			System.out.println("Total Net Income: RM"+f.netIncome());
		}
		else if(option == 5) {
			Marketing m = new Marketing();
			System.out.println();
			m.printAdvertisement();
		}
		else {
			Employee e = new Employee();
			e.printInfo();
		}

	}

}
