//program to calculate grade of the student
//Day 2
import java.util.Scanner;
class ReportCard
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Name: ");
		String name=sc.nextLine();
		System.out.print("Roll number: ");
		int roll=sc.nextInt();
		System.out.print("Marks: ");
		int marks=sc.nextInt();
		if(marks>=90 && marks<=100) System.out.println("Grade: O");
		else if(marks>=90 && marks<=100) System.out.println("Grade: O");
		else if(marks>=80 && marks<=89) System.out.println("Grade: A1");
		else if(marks>=70 && marks<=79) System.out.println("Grade: A2");
		else if(marks>=60 && marks<=69) System.out.println("Grade: B1");
		else if(marks>=50 && marks<=59) System.out.println("Grade: B2");
		else if(marks>=40 && marks<=49) System.out.println("Grade: C1");
		else if(marks>=34 && marks<=39) System.out.println("Grade: P");
		else if(marks>=0 && marks<=33) System.out.println("Grade: F");
		else System.out.println("Invalid Marks.");
	}
}