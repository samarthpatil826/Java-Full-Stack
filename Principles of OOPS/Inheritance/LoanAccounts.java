package inheritance;

public class LoanAccounts extends BankAccounts{
	
	int amt;
	int period;
	int roi;
	int type;
	
	public LoanAccounts() {
		// TODO Auto-generated constructor stub
	}

	public LoanAccounts(String name, String ifsc, String bankName, long accno, int pin, String branch, long phno, int amt, 
			int period, int roi, int type) {
		
		this.name = name;
		this.ifsc = ifsc;
		this.bankName = bankName;
		this.accno = accno;
		this.pin = pin;
		this.branch = branch;
		this.phno = phno;
		
		this.amt = amt;
		this.period = period;
		this.roi = roi;
		this.type = type;
	}
	
	public void displayLoanAccounts() 
	{
		displayBankAccounts();
		
		System.out.println(amt);
		System.out.println(period);
		System.out.println(roi);
		System.out.println(type);
	}

}
