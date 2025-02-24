import java.util.Scanner;
class ForFactors 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num= sc.nextInt();
		int cnt= 0;

		for (int i=2 ;i<num ;i++ )
		{
			if (num%i==0)
			{
				System.out.print(i+ " ");
				cnt++;
			}
		}
		System.out.println();
		System.out.println(cnt);
	}
}
