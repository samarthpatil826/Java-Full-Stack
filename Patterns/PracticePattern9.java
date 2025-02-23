class PracticePattern9 
{
	public static void main(String[] args) 
	{
		int n=1;
		char c='a';
		for (int i=1 ;i<=5 ;i++ )
		{
			for (int j=1 ;j<=i ;j++ )
			{
				if (i%2==0)
				{
					System.out.print(n++ +" ");
				}
				else 
					System.out.print(c++ +" ");
			}
			System.out.println();
		}
	}
}
