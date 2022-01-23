//program to find third largest number in array
import java.util.Scanner;
class ThirdLargest
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter "+size+" elements of the array:");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.print("Array = [ ");
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println("]");
		System.out.println("Third Largest Number = "+findNum(array));
	}

	public static int findNum(int[] a)
	{
		int first=a[0], second=a[0], third=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>first)
			{
				first=a[i];
			}
		}
		for(int i=1;i<a.length;i++)
		{
			if(second<a[i] && a[i]<first)
			{
				second=a[i];
			}
		}
		for(int i=1;i<a.length;i++)
		{
			if(third<a[i] && a[i]<second)
			{
				third=a[i];
			}
		}
		return third;
	}
}