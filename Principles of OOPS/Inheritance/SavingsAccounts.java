package inheritance;

public class SavingsAccounts extends BankAccounts {
	
	double balance;
	double intrest;
	String limit;

	public SavingsAccounts() {
		// TODO Auto-generated constructor stub
	}
	
	public SavingsAccounts(String name, String ifsc, String bankName, long accno, int pin, 
			String branch, long phno, double balance, double intrest, String limit) {
		
		this.name = name;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accno = accno;
		this.pin = pin;
		this.branch = branch;
		this.phno = phno;
		
		this.balance = balance;
		this.intrest = intrest;
		this.limit = limit;
	}
	
	public void displaySavingsAccounts()
	{
		displayBankAccounts();
		
		System.out.println(balance);
		System.out.println(intrest);
		System.out.println(limit);
	}

}
