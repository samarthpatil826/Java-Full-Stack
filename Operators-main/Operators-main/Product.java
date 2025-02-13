import java.util.Scanner;
class Product 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num= sc.nextInt();

		int product= 1;

		int rem = num%10;
		product= product*rem;
		num= num/10;

		rem= num%10;
		product= product*rem;
		num= num/10;

		rem= num%10;
		product= product*rem;
		num = num/10;

		rem= num%10;
		product= product*rem;
		num = num/10;
		
		System.out.print("The Product of the digit is : "+ product);
	}
}
