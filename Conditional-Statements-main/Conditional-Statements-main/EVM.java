import java.util.Scanner;
class EVM 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int bjp=0 , cng=0, aap=0, mns=0, ss=0, nota=0;
		System.out.println();
		System.out.println("     WELCOME");
		System.out.println();
		System.out.println("Enter the population :");
		int pop= sc.nextInt();

		for(int i=1; i<=pop; i++)
        {
			System.out.println();
			System.out.println("     LIST OF PARTIES");
			System.out.println("1. BJP ");
			System.out.println("2. CONGRESS ");
			System.out.println("3. SHIV SENA ");
			System.out.println("4. AAP ");
			System.out.println("5. MNS ");
			System.out.println("6. NOTA ");
			System.out.println();
			System.out.println("SELECT THE OPTION :");

			int opt= sc.nextInt();

			if(opt>=1 && opt<=6){
				if (opt==1)
			    {
					bjp++;
					System.out.println("ACCHE DIN AAYENGE");
			    }
				if (opt==2)
			    {
					cng++;
					System.out.println("BHARAT TODO");
			    }
				if (opt==3)
				{
					ss++;
					System.out.println("HUM HAI ASLI SENA");
				}
				if (opt==4)
				{
					aap++;
					System.out.println("MUJE AZAD KARO");
				}
				if (opt==5)
				{
					mns++;
					System.out.println("JAI MAHARASHTRA");
				}
				if (opt==6)
				{
					ss++;
					System.out.println("YOU ARE EDUCATED");
				}
				if (!(opt>=1 && opt<=6))
				{
					i--;
					System.out.println("INVALID OPTION");
				}
			}
			if (bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
			{
				System.out.println("BJP WON THE ELECTION BY" +bjp+" VOTES");
			}
			if (cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota)
			{
				System.out.println("CONGRESS WON THE ELECTION BY" +cng+" VOTES");
            }
			if (ss>=bjp && ss>=cng && ss>=aap && ss>=mns && ss>=nota)
			{
				System.out.println("SHIV SENA WON THE ELECTION BY" +ss+" VOTES");
            }
			if (aap>=bjp && aap>=ss && aap>=cng && aap>=mns && aap>=nota)
			{
				System.out.println("AAP WON THE ELECTION BY" +aap+" VOTES");
            }
			if (mns>=bjp && mns>=ss && mns>=aap && mns>=cng && mns>=nota)
			{
				System.out.println("MNS WON THE ELECTION BY" +mns+" VOTES");
            }
			if (nota>=bjp && nota>=ss && nota>=aap && nota>=mns && nota>=cng)
			{
				System.out.println("NOTA WON THE ELECTION BY" +nota+" VOTES");
            }
	}
  }
}
