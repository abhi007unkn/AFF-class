import java.util.Scanner;

class Leapyear
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year: ");
		
		int year = sc.nextInt();
		String result = (year%4==0)&&(year%100!=0)&&year%400 ==0 ? "Leap year" : "Not leap year";
		System.out.println(result);
 	}
	
}
