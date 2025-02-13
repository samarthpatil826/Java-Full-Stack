import java.util.Scanner;
class Result 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your marks :");
		int m= sc.nextInt();
		float res =(m*100)/600;
		System.out.println(res);
		String a= (res>=35)?("Pass"):("Fail");
		System.out.println(a);
	}
}
