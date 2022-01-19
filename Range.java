//Aniket Singh  -  Question 4
import java.util.Scanner;
import java.lang.Math;
class Range
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a range: ");
		int range=sc.nextInt();
		for(int i=1;i<=range;i++)
		{
			if(check(i))
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}

	public static boolean check(int n)
	{
		int length=String.valueOf(n).length(), rem, temp=n;
		double sum=0;
		while(temp>0)
		{
			rem=temp%10;
			sum=sum+Math.pow(rem,length);
			temp=temp/10;
		}
		return (sum==n)?true:false;
	}
}