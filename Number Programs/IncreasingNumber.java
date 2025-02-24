import java.util.Scanner;
class IncreasingNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		boolean flag= true;
		int n=10;

		for (int i=num ;i>0 ;i/=10 )
		{
			int rem= i%10;

			if (rem > n)
			{
				flag= false;
				break;
			}
			n=rem;
		}
		System.out.println(flag ? num+" is increasing number ": num+" is not increasing number");
	}
}
