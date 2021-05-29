package StorageRentalBusiness;

public class Finance {

	private double income;
	private double employSalary;
	private double maintenanceFee;
	private double utility;
	private double advertFees;
	
	public Finance(double i,double es,double mf,double u,double af) {  //constructor with 5 arguments
		this.income = i;
		this.employSalary = es;
		this.maintenanceFee = mf;
		this.utility = u;
		this.advertFees = af;
	}
	
	public double calTotalExpenses() {
		return employSalary + maintenanceFee + utility + advertFees;
	}
	
	public double netIncome() {
		return income - calTotalExpenses();
	}
	
}
