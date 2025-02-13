import java.util.Scanner;
class Vowel 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character :");
		char ch = sc.next().charAt(0);

		String op= (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')?(ch +" is a Vowel"):(ch +" is Consonent");
		System.out.println(op);
	}
}
