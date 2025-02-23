class PracticePattern4 
{
	public static void main(String[] args) 
	{
		for (int i=1 ;i<=4 ;i++ )
		{
			char n='a';
			for (int j=1 ;j<=i ;j++ )
			{
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
	}
}
