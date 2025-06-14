class MethodStrongNum 
{
	public static void main(String[] args) 
	{
		System.out.println(isStrong(145));
	}
	public static boolean isStrong(int num)
	{
		int sum=0;
		for (int i=num ;i !=0 ;i/=10 )
		{
			int last=num%10;
			sum+=factorial(last);
		}
		return num==sum;
	}
	public static int factorial(int digit)
	{
		int fact=1;
		for (int i=digit; i>0 ;i-- )
		{
			fact*=i;
		}
		return fact;
	}
}
