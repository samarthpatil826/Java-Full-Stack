import java.util.Scanner;
class MinutesToYear
{
	public static void main(String[] args) 
	{
      Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the number of minutes: ");
	  int minutes= sc.nextInt();

	  int days = minutes/1440;
	  int year = days/365;
	  int totalDays= year * 365;
	  int remDays= days - totalDays;

	 System.out.println(minutes + "minutes is approximately " + year +" years and " + remDays + " Days");
	}
}
