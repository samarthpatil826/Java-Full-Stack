class MethodPrimeRange 
{
	public static void main(String[] args) 
	{
		for (int start=1 ;start<=100 ;start++ )
		{
			if (isPrime(start))
			{
				System.out.println(start);
			}
		}
	}
	public static boolean isPrime(int num)
	{
		int den=2;
		for (;den<num ;den++ )
		{
			if (num%den==0)
			{
				return false;
			}
		}
		return true;
	}
}
