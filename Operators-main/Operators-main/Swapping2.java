class Swapping2 
{
	public static void main(String[] args) 
	{
	 int a= 5;
	 int b= 8;

	 System.out.println("Before Swapping");
	 System.out.println("a: "+ a);
	 System.out.println("b: "+ b);

	 a= a+b;
	 b=a-b;
	 a=a-b;

	 System.out.println("After Swapping");
	 System.out.println("a: "+ a);
	 System.out.println("b: "+ b);
	}
}
