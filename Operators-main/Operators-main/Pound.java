import java.util.Scanner;
class Pound  
{
	public static void main(String[] args) 
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.print("Enter a number of pounds :");
	 float pound= sc.nextFloat();

	 float kg= pound*0.454f;
	 System.out.print(pound+ "pound is "+ kg);
	}
}
