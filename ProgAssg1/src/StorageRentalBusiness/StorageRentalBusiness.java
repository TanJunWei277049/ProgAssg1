package StorageRentalBusiness;

public class StorageRentalBusiness {
	
	private String companyName;
	private int phoneNum;
	private String businessTime;
	
	public StorageRentalBusiness(String companyName) {  //constructor with 1 argument
		this.companyName = companyName;
	}
	
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}
	
	public String getCompanyName() {
		return this.companyName;
	}
	
	public int getPhoneNum() {
		return this.phoneNum;
	}
	
	public String getBusinessTime() {
		return this.businessTime;
	}

}
