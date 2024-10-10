import java.util.Scanner;

class Vowel
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a character :");
		char ch=sc.next().charAt(0);

		char r=
		(ch>='A' && ch<='Z') || (ch>='a' && ch<='z')? (ch>='A' && ch<='Z')?(char)(ch+32):ch :'0';
		System.out.println(r=='0' ? "Provided value is not an alphabet":"Result : "+r);
		
		System.out.println(r=='a' || r=='e' || r=='i' || r=='o' || r=='u'? r+" is a vowel" : r+" is not a vowel");

	}
}  //O shows that the value entered is not a alphabet.