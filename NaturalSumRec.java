//program to find sum of first N natural numbers using recusrion
//Day 2
import java.util.Scanner;
class NaturalSumRec
{
	public static int sum=0;

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the range: ");
		int range=sc.nextInt();
		System.out.println("Sum of first "+range+" Natural Numbers = "+sum(range));
	}

	public static int sum(int range)
	{
		if(range<1)
		{
			return sum;
		}
		else
		{
			sum=sum+range;
			return sum(range-1);
		}
	}
}