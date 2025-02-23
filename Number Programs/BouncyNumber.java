import java.util.Scanner;
class BouncyNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");
		int num= new Scanner(System.in).nextInt();
		int predigit1=-1;
		int predigit2=10;
		boolean flag1= false;
		boolean flag2= false;

		for (int i=num ;i>0 ;i/=10 )
		{
			int rem=i%10;
			if (rem<predigit1)
			   flag1= true;

			else if (rem>predigit2)
			   flag2= true;

			predigit1=rem;
			predigit2=rem;
		}
		if (flag1 && flag2)
		   System.out.println(num+" is bouncy number");

		else 
			System.out.println(num+" is bouncy number");
	}
}
