/*import java.util.Scanner;
class EvilNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");
		Scanner sc= new Scanner (System.in);
		int num= sc.nextInt();
		int count=0;
		String bin="";

		for (int i=num ;i>0 ;i/=2 )
			bin= i%2 + bin;

		for (int i=0 ;i<bin.length() ;i++ )
		{
			if (bin.charAt(i)=='1')
			   count++;
		}
		if (count%2==0)
			System.out.println(num+ " is a evil number");
		else
			System.out.println(num+ " is not a evil number");
	}
}*/

import java.util.Scanner;
class EvilNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number : ");
		Scanner sc= new Scanner (System.in);
		int num= sc.nextInt();
		int count=0;
		String bin=Integer.toBinaryString(num);

		for (int i=0 ;i<bin.length() ;i++ )
		{
			if (bin.charAt(i)=='1')
			   count++;
		}
		if (count%2==0)
			System.out.println(num+ " is a evil number");
		else
			System.out.println(num+ " is not a evil number");
	}
}

