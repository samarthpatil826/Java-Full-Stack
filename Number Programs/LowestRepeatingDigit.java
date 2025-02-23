import java.util.Scanner;
class LowestRepeatingDigit 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		long num = sc.nextLong();
		int dgt = 0;
		int min = 9;
		
		for (int i = 0;i<=9 ;i++ )
		{
			int cnt = 0;
			for (long j =num;j>0 ;j/=10 )
			{
				long rem = j%10;
				if (i == rem)
				{
					cnt++;
				}
			}
			if (cnt!=0)
			{
				if (min>cnt)
				{
					min = cnt;
					dgt = i;
				}
			}
		}
		System.out.println("Lowest repeating digit is "+dgt+" with a frequency of "+min);
	}
}
 

