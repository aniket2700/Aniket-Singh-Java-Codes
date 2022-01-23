//program to find sum of each row and column in array
import java.util.Scanner;
class RowColSum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int row=sc.nextInt();
		System.out.print("Enter number of columns: ");
		int col=sc.nextInt();
		int[][] a=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("Number at "+(i)+(j)+": ");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array-");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		rowSum(a,row,col);
		colSum(a,row,col);
	}

	public static void rowSum(int[][] a, int row, int col)
	{
		int sum=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				sum=sum+a[i][j];
			}
			System.out.println("Sum of row "+i+" = "+sum);
			sum=0;
		}
	}

	public static void colSum(int[][] a, int row, int col)
	{
		int sum=0;
		for(int i=0;i<col;i++)
		{
			for(int j=0;j<row;j++)
			{
				sum=sum+a[j][i];
			}
			System.out.println("Sum of col "+i+" = "+sum);
			sum=0;
		}
	}
}