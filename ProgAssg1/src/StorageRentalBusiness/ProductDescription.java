package StorageRentalBusiness;

public class ProductDescription {
	
	private double price;
	private double storageSize;
	private String location;
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double getStorageSize() {
		return this.storageSize;
	}
	
	public String getLocation() {
		return this.location;
	}
	
	
}
