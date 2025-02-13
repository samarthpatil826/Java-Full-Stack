import java.util.Scanner;
class Lowercase 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character :");
		char ch= sc.next().charAt(0);
		String op=(ch>='a'&&ch<='z')?(ch + " is a Lowercase"):(ch +" Not a Lowercase");
		System.out.println(op);

	}
}
