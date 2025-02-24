import java.util.Scanner;
class ForProduct 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num= sc.nextInt();
		int product= 1;

		while (num>=1)
		{
			int rem = num%10;
		    product= product*rem;
		    num= num/10;
		}
		System.out.println("The product of the digit is : "+product);
	}
}
