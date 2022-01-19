//Aniket Singh  -  Question 5
import java.util.Scanner;
class ExtremeDigits
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		long n=sc.nextLong();
		String s=String.valueOf(n);
		int l=s.length();
		System.out.println("First Digit = "+Character.getNumericValue(s.charAt(0)));
		System.out.println("Last Digit = "+Character.getNumericValue(s.charAt(l-1)));
	}
}