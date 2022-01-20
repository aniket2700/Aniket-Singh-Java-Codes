//reversing a number using recursion
//program to reverse a string using recursion
//Day 2
import java.util.Scanner;
class StringReverseRec
{
	public static String res="";

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s=sc.nextLine();
		int l=s.length()-1;
		System.out.println(reverse(s,l));
	}

	public static String reverse(String s,int l)
	{
		if(l<0)
		{
			return res;
		}
		else
		{
			res=res+s.charAt(l);
			return reverse(s,l-1);
		}
	}
}