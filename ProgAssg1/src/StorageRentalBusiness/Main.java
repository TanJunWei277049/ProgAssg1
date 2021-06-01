package StorageRentalBusiness;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int choose;
		
		StorageRentalCentre src = new StorageRentalCentre("LUCKY","Jalan Besar, Taman Gembira",32500008,"www.luckystoragerental.com");
		src.printInfo();
		
		do {
			System.out.println("\nChoose your option:-");
			System.out.println("1-Admin");
			System.out.println("2-Customer");
			System.out.print("\nEnter option: ");
			int option = input.nextInt();
			
			if(option == 1) {
				System.out.println("\nWELCOME BACK ADMIN");
				System.out.println("Please choose your option :-");
				System.out.println("1. Financial Report");
				System.out.println("2. Employee");
				System.out.print("\nEnter option: ");
				int adminOption = input.nextInt();
				
				if(adminOption == 1) {
					Finance finance = new Finance(10000,2000,3500,200,1400);
					System.out.println("\n-------Financial report-------");
					System.out.println("Total Income\t:"+finance.getIncome());
					System.out.println("Total Expenses\t:"+finance.totalExpenses());
					System.out.println("Total Profit\t:"+finance.netProfit());
				}
				else {
					Employee employee = new Employee();
					
				}
				
			}
			else {
				System.out.println();
				AdvertisementAndMarketing ads = new AdvertisementAndMarketing();
				ads.printAdvertisement();
				
				System.out.println("\nWhat do you want to do:-");
				System.out.println("1. Product Description");
				System.out.println("2. Rent A Storage");
				System.out.print("\nPlease Enter Your Option: ");
				int customerOpt = input.nextInt();
				
				if(customerOpt == 1) {
					System.out.println("\nWhich storage are you interested in ?");
					System.out.println("1. Normal Storage");
					System.out.println("2. Storage with Freezer");
					System.out.println("3. Double Storey Storage");
					System.out.print("Enter your option: ");
					int storageType = input.nextInt();
					
					StorageType storage = new StorageType(storageType);
					
				}
				else {
					Customer customer = new Customer();
					customer.printInfo();
					
					System.out.println("\nSelect the storage you want to rent: ");
					System.out.println("1. Normal Storage");
					System.out.println("2. Storage with Freezer");
					System.out.println("3. Double Storey Storage");
					System.out.print("Enter your option: ");
					int storageOpt = input.nextInt();
					System.out.print("Enter the size(in square feet): ");
					double size = input.nextDouble();
					
					Sales sale = new Sales(storageOpt,size);
				}
			}
		System.out.print("\nDo you want to continue?(1-Yes  2-No)");
		choose = input.nextInt();
			
		}while(choose == 1);
	}  //end main

}  // end class 
