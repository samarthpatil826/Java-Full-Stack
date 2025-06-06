package inheritance;

public class BankAccounts {
	
	String name;
	String ifsc;
	String bankName;
	long accno;
	int pin;
	String branch;
	long phno;

	public BankAccounts() {
		// TODO Auto-generated constructor stub
	}
	
	public BankAccounts(String name, String ifsc, String bankName, long accno, int pin, String branch, long phno) {
		this.name = name;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accno = accno;
		this.pin = pin;
		this.branch = branch;
		this.phno = phno;
	}
	
	public void displayBankAccounts() {
		
		System.out.println(name);
		System.out.println(ifsc);
		System.out.println(bankName);
		System.out.println(accno);
		System.out.println(branch);
		System.out.println(phno);
	}


}
