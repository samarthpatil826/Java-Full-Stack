package inheritance;

public class DematAccounts extends BankAccounts {
	
	double balance;
	double brokerage;
	int holding;
	int id;

	public DematAccounts() {
		// TODO Auto-generated constructor stub
	}

	public DematAccounts(String name, String ifsc, String bankName, long accno, int pin, String branch, long phno, 
			double balance, double brokerage, int holding, int id) {
		
		this.name = name;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accno = accno;
		this.pin = pin;
		this.branch = branch;
		this.phno = phno;
		
		this.balance = balance;
		this.brokerage = brokerage;
		this.holding = holding;
		this.id = id;
	}
	
	public void displayDematAccounts() {
		
		displayBankAccounts();
		
		System.out.println(balance);
		System.out.println(brokerage);
		System.out.println(holding);
		System.out.println(id);
	}
	
	
	

}
