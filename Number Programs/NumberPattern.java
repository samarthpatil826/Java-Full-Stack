class NumberPattern 
{
	public static void main(String[] args) 
	{
		int n=5;
		int a= 0;

		for (int i=1 ;i<=n ;i++ )
		{
			a+=i;
			for (int j=0 ;j<i ;j++ )
			{
				System.out.print((a-j)+"  ");
			}
			System.out.println();
		}
	}
}
