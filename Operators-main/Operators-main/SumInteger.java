import java.util.Scanner;
class SumInteger 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number between 0 and 1000 : ");
		int num= sc.nextInt();

		int dup= num;
		int sum= 0;

		int rem = num%10;
		sum= sum+rem;
		num= num/10;

		rem= num%10;
		sum= sum+rem;
		num= num/10;

		rem= num%10;
		sum= sum + rem;
		num = num/10;
		
		System.out.print("The sum of the digits is : "+ sum);
	}
}
