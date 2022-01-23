class PrintArrayRec
{
	public static void main(String[] args)
	{
		int[] array={12,543,567,234,23};
		printArray(array,0);
		System.out.println();
	}

	public static void printArray(int[] a,int i)
	{
		if(i>a.length-1)
		{
			return;
		}
		else
		{
			System.out.print(a[i]+" ");
			printArray(a,i+1);
		}
	}
}