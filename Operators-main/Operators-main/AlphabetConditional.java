import java.util.Scanner;
class Alphabet 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character :");
		char ch= sc.next().charAt(0);
		String op=(ch>='A'&&ch<='Z')?(ch+" is a uppercase"):((ch>='a'&&ch<='z')?(ch+" is a lowercase"):(ch>='0'&&ch<='9')?(ch+" is a digit"):("is a special character"));
		System.out.println(op);

	}
}
