package StorageRentalBusiness;

public class Sales {
	
	private double price;
	private double storageSize;
	
	public Sales(double p, double s) {  //constructor with 2 arguments
		this.price = p;
		this.storageSize = s;
		
		if(storageSize<=30) {
			totalPrice();
			System.out.println("Storage size :"+storageSize+" square feet");
			System.out.println("Price per square feet :RM"+price);
			System.out.println("Total price :"+totalPrice());
		}
		else if(storageSize>30 && storageSize<=70) {
			double newPrice = 25;
			totalPrice(newPrice);
			System.out.println("Storage size :"+storageSize+" square feet");
			System.out.println("Price per square feet :RM"+newPrice);
			System.out.println("Total price :"+totalPrice(newPrice));
		}
		else {
			double newPrice = 22;
			double discount = 0.15;
			totalPrice(newPrice,discount);
			System.out.println("Storage size :"+storageSize+" square feet");
			System.out.println("Price per square feet :RM"+newPrice);
			System.out.println("Discount :"+(discount*100)+"%");
			System.out.println("Total price :"+totalPrice(newPrice,discount));
		}
	}
	
	public double totalPrice() {
		return this.price*this.storageSize;
	}
	
	public double totalPrice(double newPrice) {
		return newPrice*this.storageSize;
	}
	
	public double totalPrice(double newPrice, double discount) {
		return (newPrice*this.storageSize)*(1-discount);
	}

}
