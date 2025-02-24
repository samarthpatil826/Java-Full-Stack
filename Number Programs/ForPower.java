import java.util.Scanner;
class ForPower 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num= sc.nextInt();
		System.out.println("Enter the power : ");
		int pow= sc.nextInt();

		int op=1;

		for (int i=1 ;i<=pow ;i++ )
		{
			op *= num;
		}
		System.out.println(num+"^"+pow+"= "+op);
	}
}
