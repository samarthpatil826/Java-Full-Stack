import java.util.Scanner;
class MethodPrime 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");
		int num= new Scanner (System.in).nextInt();

		System.out.print(prime(num));
	}
	public static boolean prime(int n)
	{
		int den=2;

		for (;den<n;den++ )
		{
			if (n % den==0)
			{
				System.out.println("not prime");
				break;
			}
		}
		return n==den;
	}
}
