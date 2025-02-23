class PracticePattern7 
{
	public static void main(String[] args) 
	{
		int a=2;
		for (int i=1 ;i<=4 ;i++ )
		{
			for (int j=1 ;j<=i ;j++ )
			{
				System.out.print(a+" ");
				a+=2;
			}
			System.out.println();
		}
	}
}
