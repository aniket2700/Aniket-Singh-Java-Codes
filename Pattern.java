//Aniket Singh  -  Question 6
class Pattern
{
	public static void main(String[] args)
	{
		stars(4);
		numbers(5);
	}

	public static void stars(int size)
	{
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void numbers(int size)
	{
		for(int i=1;i<=size;i++)
		{
			for(int k=size-i;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}