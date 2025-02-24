import java.util.Scanner;
class ForLastDigit 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number :");
		int num= new Scanner(System.in).nextInt();
		int dup= num;
		int sum= 0;

		while (num>0)
		{
			int rem= num%10;
			sum= sum+rem;
			num /=10;
		}
		System.out.println(sum);

		while (dup>0)
		{
			if (dup%2==0)
			{
				System.out.println(dup);
			}
		}
	}
}
