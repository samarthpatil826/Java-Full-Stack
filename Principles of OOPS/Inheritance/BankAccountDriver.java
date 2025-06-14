package inheritance;

public class BankAccountDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount s1 = new SavingsAccount("sam", "ICICI0202", "ICICI", 12074321l, 1234, "Deccan", 1924868556l, 5000.0, 3, "Savings Account");
		
		s1.displayBankAccount();
		System.out.println("------------------");
		
		s1.displaySavingsAccount();
	}

}
