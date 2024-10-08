import java.util.Scanner;

class VoteEligibilityCheck
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		int age = 0;
		System.out.printf("Enter age : ");
		age = input.nextInt();
		int res = age >= 18?1:0;
		switch (res)
		{
			case 1:
	
			System.out.printf("You are not eligible for vote...");
			break;
	
			case 2:
			System.out.printf("You are eligible for vote..");
			break;
		}
		
 	}
	
}
