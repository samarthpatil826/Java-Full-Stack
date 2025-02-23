import java.util.Scanner;
class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num= sc.nextInt();
		int len=0, div=1;

		for (int i=num ;i>0 ;i/=10 )
		    len++;

		for (int i=1 ;i<=len ;i++ )
		    div*=10;

		System.out.println(num == (num*num)%div ? num+" is a automorphic Number": num+" is not a automorphic number");
	}
}
