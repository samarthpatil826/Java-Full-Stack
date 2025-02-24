import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num= sc.nextInt();
		int sum=0;
		int sqr= num*num;

		for (int i=sqr ;i>0 ;i/=10 )
		   sum+=(i%10);
		   if (sum==num)
			System.out.println(num+ " is a neon number");
		   else
			System.out.println(num+ " is not a neon number");
	}
}
