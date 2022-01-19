//Aniket Singh  -  Question 3
import java.util.Scanner;
class Armstrong
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
		int rem,sum=0,num=n;
		while(num>0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		return (sum==n)?true:false;
	}
}