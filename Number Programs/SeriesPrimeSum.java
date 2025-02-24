class SeriesPrimeSum 
{
	public static void main(String[] args) 
	{

		for (int i=23, num=56 ;i<=43 && num<=260 ;i++) //56
		{
			boolean flag=true;
			for (int j=2 ;j<i ;j++ )
			{
				if (i%j==0)
			    {
				flag= false;
				break;
			    }
			}
			if (flag)
			{
				num+=i;
				System.out.print(num+" ");
			}
		}
	}
}
