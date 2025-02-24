class PracticePattern5 
{
	public static void main(String[] args) 
	{
		char n='a';
		for (int i=1 ;i<=4 ;i++ )
		{
			for (int j=1 ;j<=i ;j++ )
			{
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
	}
}
