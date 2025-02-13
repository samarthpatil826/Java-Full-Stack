import java.util.Scanner;
class SumEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		//System.out.println("Enter the number between 0 and 1000 : ");
		//int num= sc.nextInt();

		int num = 7264;
		int temp= 0;
		int EvenSum= 0;
		int OddSum= 0;


		int rem = num%10;
		temp= (rem%2 ==0)?(EvenSum= EvenSum+rem):(OddSum= OddSum+rem);
		num= num/10;

		rem= num%10;
		temp= (rem%2 ==0)?(EvenSum= EvenSum+rem):(OddSum= OddSum+rem);
		num= num/10;

		rem= num%10;
		temp= (rem%2 ==0)?(EvenSum= EvenSum+rem):(OddSum= OddSum+rem);
		num = num/10;

		rem= num%10;
		temp= (rem%2 ==0)?(EvenSum= EvenSum+rem):(OddSum= OddSum+rem);
		num = num/10;

		System.out.println("Even sum is :" + EvenSum);
		System.out.println("Odd sum is :" + OddSum);
	}
}
