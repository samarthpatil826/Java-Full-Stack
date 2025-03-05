class Methodex1 
{
	static int num=12;
	public static void main(String[] args) 
	{
		square();
		reverse();
		evenOdd();
	}
	public static void square()
	{
		int sqr= num*num;
		System.out.println(sqr);
	}
	public static void reverse()
	{
		int rev=0;
		for (int i=num ;i>0 ;i/=10 )
		  rev=rev*10+(i%10);
		System.out.println(rev);
	}
	public static void evenOdd()
	{
		System.out.println(num%2==0 ? num+" is even": num+" is odd");
	}
}
