package inheritance;

public class BankAccountsDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DematAccounts d1 = new DematAccounts("Sam", "BOI0987", "Bank of India", 030405060l, 1234, "Deccan", 00234500l, 5000.0, 20, 10, 112233);
		
		d1.displayDematAccounts();
		
		System.out.println("-------------------");
		
		d1.displayBankAccounts();
				
				

	}

}
