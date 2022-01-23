//program for polymorphism - oops concept
class Polymorphism
{
	public static void main(String[] args)
	{
		System.out.println(multiply(2,3));
		System.out.println(multiply(2,3,4));
		System.out.println(multiply(2.7,3.3));
		System.out.println(multiply(2.3,4.4,5.6));
	}

	public static int multiply(int n1, int n2)
	{
		return n1*n2;
	}

	public static int multiply(int n1, int n2, int n3)
	{
		return n1*n2*n3;
	}

	public static double multiply(double n1, double n2)
	{
		return n1*n2;	
	}

	public static double multiply(double n1, double n2, double n3)
	{
		return n1*n2*n3;
	}
}