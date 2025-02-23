class ForSumEvenOdd  
{
	public static void main(String[] args) 
	{
		int num= 2345;
		int evenSum= 0;
		int oddSum= 0;

		while (num>0)
		{
		int rem = num%10;
		if (rem%2==0)
		{
			evenSum +=rem;
		}
		else 
			oddSum +=rem;

		num= num/10;
		}
		System.out.println("The sum of the even digits is : "+ evenSum);
		System.out.println("The sum of the odd digits is : "+ oddSum);
	}
}
