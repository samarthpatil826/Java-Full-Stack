class FascinatingNumber 
{
	public static void main(String[] args) 
	{
		boolean flag= true;
		int num= 327;
		String str= num+""+(num*2)+(num*3);

		for (char i= '1' ;i<='9' ;i++ )
		{
			int cnt= 0;

			for (int j=0 ;j<str.length() ;j++ )
			{
				char ch= str.charAt(j);
				if (ch==i)
				    cnt++;
			}
			if (cnt !=1)
			{
				flag= false;
				break;
			}
		}
		if (flag)
		{
			System.out.println(num+" is Fascinating Number");
		}
		else 
			System.out.println(num+" is not a Fascinating Number");
	}
}
