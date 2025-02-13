import java.util.Scanner;
class CurrencyConverter 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("");
		System.out.println(" CURRENCY CONVERTER");
		System.out.println("");
		System.out.println("Enter the amount (INR) :");
		float inr= sc.nextFloat();
		System.out.println("");

		System.out.println("List of currency ");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. PKR");
		System.out.println("4. RUB");
		System.out.println("4. JPY");

		System.out.println("Enter the currency");

		String cur= sc.next().toUpperCase();
		float curr= 0;

		if(cur.equals("USD")){
			curr=inr/86.56f;
			System.out.println(inr +" INR =" +curr+" USD");
		}
		if(cur.equals("EUR")){
			curr=inr/90.25f;
			System.out.println(inr +" INR =" +curr+" EUR");
		}
		if(cur.equals("GBP")){
			curr=inr/105.65f;
			System.out.println(inr +" INR =" +curr+" GBP");
		}
		if(cur.equals("PKR")){
			curr=inr/322.82f;
			System.out.println(inr +" INR =" +curr+" PKR");
		}
		if(cur.equals("RUB")){
			curr=inr/1.13f;
			System.out.println(inr +" INR =" +curr+" RUB");
		}
		if(cur.equals("JPY")){
			curr=inr/1.79f;
			System.out.println(inr +" INR =" +curr+" JPY");
		}
	    else{
	      System.out.println("INVALID ");
		}
		    
	}
}
