class MethodPalindrome 
{
	public static void main(String[] args) 
	{
		int n=121;
		if (isPalindrome(n))
			System.out.println(n+" is palindrome number");
		else 
			System.out.println(n+" is not a palindrome number");
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
}