import java.util.Scanner;
class Uppercase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character :");
		char ch= sc.next().charAt(0);
		String op=(ch>='A'&&ch<='Z')?(ch + " is a Uppercase"):(ch +" Not a Uppercase");
		System.out.println(op);

	}
}
