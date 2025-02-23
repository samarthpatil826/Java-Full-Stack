import java.util.Scanner;
class ForSquareRoot 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num= sc.nextInt();
		boolean flag= false;

		for (int i=1 ;i<=num ;i++ )
		{
			if (i*i==num)
			{
				flag= true;
				System.out.println(i+" Perfect square root for "+num);
			}
			if (i*i> num)
				break;
		}
		if (!flag)
		{
			System.out.println(num+ " Not have a perfect square root");
		}
	}
}
