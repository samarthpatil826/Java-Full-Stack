class ForVowel 
{
	public static void main(String[] args) 
	{
		for (char ch='A' ;ch<='Z' ;ch++ )
		{
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				System.out.print(ch+ " :");
				System.out.println("Vowel");
			}
			else 
			{
				System.out.print(ch+ " :");
				System.out.println("Consonant");
			}
		}
	}
}
