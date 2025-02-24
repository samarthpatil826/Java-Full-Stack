import java.util.Scanner;
class BinaryToDecimal 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");
		int bin= new Scanner(System.in).nextInt();
		int sum=0;
		int len=0;

		for (int i=bin ;i>0 ;i/=10 )
		{
			len++;
			int rem=i%10;

			if (rem==1)
			{
				int power=1;
				for (int j=0 ;j<(len-1) ;j++ )
					power*=2;

				sum+= power;
			}
		}
		System.out.println(bin+" : "+sum);
	}
}
