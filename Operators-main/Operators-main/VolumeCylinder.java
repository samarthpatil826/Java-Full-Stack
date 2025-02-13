import java.util.Scanner;
class VolumeCylinder 
{
	public static void main(String[] args) 
	{
	 Scanner sc = new Scanner(System.in);
     System.out.print("Enter radius : ");
	 double r= sc.nextDouble();
     System.out.print("Enter Height : ");
	 int h= sc.nextInt();

	 double area= 3.14*r*r;
	 double volume= area*h;

	 System.out.println("The area is : "+ area);
	 System.out.println("The volume is : "+ volume);
	}
}
