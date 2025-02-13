import java.util.Scanner;
class Grade 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your marks :");
		float m= sc.nextFloat();

		float res =(m*100)/600;
		System.out.println(res);
		String a= (res>=75 && res<=100)?("A"):((res>=60 && res<=75)?("B"):(res>=35 && res<=60)?("C"):("Fail"));
		System.out.println(a);
	}
}
