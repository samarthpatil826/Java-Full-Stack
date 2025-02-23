import java.util.Scanner;
class TechNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number : ");
		int num= new Scanner(System.in).nextInt();
		int len=0, div=1;
		for (int i=num ;i>0 ;i/=10 )
			len++;

		if (len%2==0)
		{
			for (int i=1 ;i<=(len/2) ;i++ )
				div*=10;

			int sum=(num/div)+(num%div);
			int sqr= sum*sum;
			System.out.println(sqr==num?num+" is a tech number":num+" is not a tech number");
		}
		else
			System.out.println(num+" is not a tech number");

	}
}
