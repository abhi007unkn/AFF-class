import java.util.Scanner;
class Leapyear
public static void main (String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter year: ");
	int year = sc.nextInt();
	(year%4==0)||(year%400==0)?System.out.println("Year is leap year");
	:System.out.println("Year is not leap year");
 }
	
}
