package StorageRentalBusiness;

public class StorageRentalCentre {
	
	private String companyName;
	private String companyAdd;
	private int phoneNum;
	private String website;
	
	public StorageRentalCentre(String companyName, String companyAdd, int phoneNum, String website) {
		this.companyName = companyName;
		this.companyAdd = companyAdd;
		this.phoneNum = phoneNum;
		this.website = website;
	}
	
	public void printInfo() {
		System.out.println("-----------Welcome To "+companyName+" Storage Rental Centre-----------");
		System.out.println("Company Name\t:"+companyName+" Storage Rental Centre");
		System.out.println("Company Address\t:"+companyAdd);
		System.out.println("Contact Number\t:"+phoneNum);
		System.out.println("Company Website\t:"+website);
	}

}
