import java.util.Scanner;
class Bmi
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the weight in pounds :");
		float w= sc.nextFloat();

		System.out.println("Enter the height in inches :");
		float h= sc.nextFloat();

		float p= w*0.45359237f;
		float i= h*0.0254f;

		float bmi= p/(i*i);

		System.out.println("BMI is "+ bmi);

	}
}
