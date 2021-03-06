package StorageRentalBusiness;

public class StorageType {  //User Define Class
	
	private int storageType;
	
	public StorageType(int storageType) {  //constructor with 1 argument
		this.storageType = storageType;
		
		if(this.storageType == 1)
			printInfoNormalStorage();
		else if(this.storageType == 2)
			printInfoFreezerStorage();
		else
			printInfoDoubleStoreyStorage();
		
	}
	
	public void printInfoFreezerStorage() {
		System.out.println("\n-------Storage Description-------");
		System.out.println("Storage Type\t\t: Storage with freezer");
		System.out.println("Price per square feet\t:RM200");
		System.out.println("Location available\t:Setia Alam, Kampar, Jeram");
	}
	
	public void printInfoNormalStorage() {
		System.out.println("\n-------Storage Description-------");
		System.out.println("Storage Type\t\t: Normal storage");
		System.out.println("Price per square feet\t:RM90");
		System.out.println("Location available\t:Kuala Selangor, Sungai Besar, Bidor");
	}
	
	public void printInfoDoubleStoreyStorage() {
		System.out.println("\n-------Storage Description-------");
		System.out.println("Storage Type\t\t: Double storey storage");
		System.out.println("Price per square feet\t:RM130");
		System.out.println("Location available\t:Batu Pahat, Kulai, Kuala Langat");
	}
	
	
}
