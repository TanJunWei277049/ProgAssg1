package StorageRentalBusiness;

public class Sales {  //User Define Class
	
	private String storageType;
	private double price;
	private double storageSize;
	private int storageOpt;
	
	public Sales(int storageOpt, double size) {  //constructor with 2 arguments
		this.storageOpt = storageOpt;
		this.storageSize = size;
		
		if(storageOpt == 1) {
			storageType = "Normal Storage";
			price = 90;
			
			if(storageSize<=30) {
				totalPrice();
				System.out.println("\n-------Storage Rent-------");
				System.out.println("Storage Type\t\t:"+storageType);
				System.out.println("Storage Size\t\t:"+storageSize+" square feet");
				System.out.println("Price per square feet\t:RM"+price);
				System.out.println("Total price\t\t:RM"+totalPrice());
			}
			else if(storageSize>30 && storageSize<=70) {
				double newPrice = 85;
				totalPrice(newPrice);
				System.out.println("\n-------Storage Rent-------");
				System.out.println("Storage Type\t\t:"+storageType);
				System.out.println("Storage Size\t\t:"+storageSize+" square feet");
				System.out.println("Price per square feet\t:RM"+newPrice);
				System.out.println("Total price\t\t:RM"+totalPrice(newPrice));
			}
			else {
				double newPrice = 82;
				double discount = 0.1;
				totalPrice(newPrice,discount);
				System.out.println("\n-------Storage Rent-------");
				System.out.println("Storage Type\t\t:"+storageType);
				System.out.println("Storage Size\t\t:"+storageSize+" square feet");
				System.out.println("Price per square feet\t:RM"+newPrice);
				System.out.println("Discount\t\t:"+(discount*100)+"%");
				System.out.println("Total price\t\t:RM"+totalPrice(newPrice,discount));
			}
		}
		else if(storageOpt == 2) {
			storageType = "Storage with Freezer";
			price = 200;
			
			if(storageSize<=30) {
				totalPrice();
				System.out.println("\n-------Storage Rent-------");
				System.out.println("Storage Type\t\t:"+storageType);
				System.out.println("Storage Size\t\t:"+storageSize+" square feet");
				System.out.println("Price per square feet\t:RM"+price);
				System.out.println("Total price\t\t:RM"+totalPrice());
			}
			else if(storageSize>30 && storageSize<=70) {
				double newPrice = 190;
				totalPrice(newPrice);
				System.out.println("\n-------Storage Rent-------");
				System.out.println("Storage Type\t\t:"+storageType);
				System.out.println("Storage Size\t\t:"+storageSize+" square feet");
				System.out.println("Price per square feet\t:RM"+newPrice);
				System.out.println("Total price\t\t:RM"+totalPrice(newPrice));
			}
			else {
				double newPrice = 180;
				double discount = 0.1;
				totalPrice(newPrice,discount);
				System.out.println("\n-------Storage Rent-------");
				System.out.println("Storage Type\t\t:"+storageType);
				System.out.println("Storage Size\t\t:"+storageSize+" square feet");
				System.out.println("Price per square feet\t:RM"+newPrice);
				System.out.println("Discount\t\t:"+(discount*100)+"%");
				System.out.println("Total price\t\t:RM"+totalPrice(newPrice,discount));
			}
		}
		else {
			storageType = "Double Storey Storage";
			price = 130;
			
			if(storageSize<=30) {
				totalPrice();
				System.out.println("\n-------Storage Rent-------");
				System.out.println("Storage Type\t\t:"+storageType);
				System.out.println("Storage Size\t\t:"+storageSize+" square feet");
				System.out.println("Price per square feet\t:RM"+price);
				System.out.println("Total price\t\t:RM"+totalPrice());
			}
			else if(storageSize>30 && storageSize<=70) {
				double newPrice = 120;
				totalPrice(newPrice);
				System.out.println("\n-------Storage Rent-------");
				System.out.println("Storage Type\t\t:"+storageType);
				System.out.println("Storage Size\t\t:"+storageSize+" square feet");
				System.out.println("Price per square feet\t:RM"+newPrice);
				System.out.println("Total price\t\t:RM"+totalPrice(newPrice));
			}
			else {
				double newPrice = 110;
				double discount = 0.1;
				totalPrice(newPrice,discount);
				System.out.println("\n-------Storage Rent-------");
				System.out.println("Storage Type\t\t:"+storageType);
				System.out.println("Storage Size\t\t:"+storageSize+" square feet");
				System.out.println("Price per square feet\t:RM"+newPrice);
				System.out.println("Discount\t\t:"+(discount*100)+"%");
				System.out.println("Total price\t\t:RM"+totalPrice(newPrice,discount));
			}
		}
		System.out.println("\nThank you. Please Come Again.");
		
	}
	
	public double totalPrice() {
		return this.price*storageSize;
	}
	
	public double totalPrice(double newPrice) {
		return newPrice*storageSize;
	}
	
	public double totalPrice(double newPrice, double discount) {
		return (newPrice*storageSize)*(1-discount);
	}

}
