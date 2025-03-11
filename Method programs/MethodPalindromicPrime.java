class MethodPalindromicPrime 
{
	public static void main(String[] args) 
	{
		int n=121;
		if (isPalindrome(n) && isPrime(n))
			System.out.println(n+" is palindromic prime number");
		else 
			System.out.println(n+" is not a palindromic prime number");
	}
	public static boolean isPalindrome(int num)
	{
		int rev=0;
		for (int i=num ;i>0 ;i/=10 )
		{
			int rem=i%10;
			rev=rev*10+rem;
		}
		return num==rev;
	}
	public static boolean isPrime(int num)
	{
		int den=2;
		for (int i=den ;i<num ;i++ )
		{
			if (i%num==0)
			    break;
		}
		return den==num;
	}
}
