class CondOperExample 
{
	public static void main(String[] args) 
	{
	 int a = 22;
	 int b = 4;
	 int c = 1;

	 int lar = (a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
	 System.out.println(lar);
	}
}
