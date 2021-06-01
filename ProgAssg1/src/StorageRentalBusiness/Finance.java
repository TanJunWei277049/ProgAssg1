package StorageRentalBusiness;

public class Finance {  //User Define Class

	private double income;
	private double employSalary;
	private double maintenanceFee;
	private double utility;
	private double advertFees;
	
	public Finance(double income,double employSalary,double maintenanceFee,double utility,double advertFees) {  //constructor with 5 arguments
		this.income = income;
		this.employSalary = employSalary;
		this.maintenanceFee = maintenanceFee;
		this.utility = utility;
		this.advertFees = advertFees;
	}
	
	public double getIncome() {
		return income;
	}
	
	public double totalExpenses() {
		return employSalary + maintenanceFee + utility + advertFees;
	}
	
	public double netProfit() {
		return income - totalExpenses();
	}
	
}
