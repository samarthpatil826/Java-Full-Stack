class ForMinDigit 
{
	public static void main(String[] args) 
	{
		int num= 1223835;
		int min= 9;

		for (int i= num; i>0 ;i/=10 )
		{
			int rem= i%10;
			if (min>rem)
				min=rem;
		}
		System.out.println("Smallest digit from "+num+" is "+min);
	}
}
