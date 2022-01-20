//program to find area of rectangle and square
//Day 2
import java.util.Scanner;
class AreaRectangleSquare
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lenght and breadth of rectangle: ");
		double l=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println("Area of rectangle: "+recArea(l,b));
		System.out.println("Enter side of square: ");
		double s=sc.nextDouble();
		System.out.println("Area of Square: "+recSquare(s));
	}

	public static double recArea(double l, double b)
	{
		return l*b;
	}

	public static double recSquare(double a)
	{
		return a*a;
	}
}