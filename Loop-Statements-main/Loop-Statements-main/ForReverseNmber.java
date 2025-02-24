import java.util.Scanner;
class ForReverseNmber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num= sc.nextInt();
		int rev=0;

		while (num>0)
		{
			int rem= num%10;
			rev= rev*10+(rem);
			if (rev>2147483647)
			{
				System.out.println(0);
			}
			num/=10;
		}
		System.out.println(rev);
	}
}
