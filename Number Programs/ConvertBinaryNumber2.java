import java.util.Scanner;
class ConvertBinaryNumber2 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();

		String bin= Integer.toBinaryString(num);

		System.out.println(num+" : "+bin);
	}
}
