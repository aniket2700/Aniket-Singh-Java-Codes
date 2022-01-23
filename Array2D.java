//program to add and multiply two arrays
import java.util.Scanner;
class Array2D
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the matrices: ");
		int size=sc.nextInt();
		int[][] a=new int[size][size];
		int[][] b=new int[size][size];
		System.out.println("Enter elements of matrix A-");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print("At row "+i+" col "+j+": ");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elements of matrix B-");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print("At row "+i+" col "+j+": ");
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix A-");
		printMatrix(a,size);
		System.out.println("Matrix B-");
		printMatrix(b,size);
		System.out.println("Sum of two Matrices-");
		int[][] c=printSum(a,b,size);
		printMatrix(c,size);
		System.out.println("Product of two Matrices-");
		int[][] d=printProduct(a,b,size);
		printMatrix(d,size);
	}

	public static void printMatrix(int[][] m, int size)
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static int[][] printSum(int[][] a,int[][] b,int size)
	{
		int[][] c=new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}

	public static int[][] printProduct(int[][] a,int[][] b,int size)
	{
		int[][] d=new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				d[i][j]=0;
				for(int k=0;k<size;k++)
				{
					d[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return d;
	}
}