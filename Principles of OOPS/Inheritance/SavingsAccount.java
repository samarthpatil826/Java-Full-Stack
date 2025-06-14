package inheritance;

public class SavingsAccount extends BankAccount {
	
	double balance;
	double intrest;
	String type;

	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	public SavingsAccount(String name, String ifsc, String bankName, long accno, int pin, 
			String branch, long phno, double balance, double intrest, String type) {
		
		this.name = name;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accno = accno;
		this.pin = pin;
		this.branch = branch;
		this.phno = phno;
		
		this.balance = balance;
		this.intrest = intrest;
		this.type = type;
	}
	
	public void displaySavingsAccount()
	{
		displayBankAccount();
		
		System.out.println(balance);
		System.out.println(intrest);
		System.out.println(type);
	}
	
	

}
