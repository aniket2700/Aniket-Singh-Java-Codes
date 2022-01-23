//program for abstract class
abstract class Car
{
	abstract void speed();
}
class AbstractClass extends Car
{
	void speed()
	{
		System.out.println("Speed of the car is 100 kmph.");
	}

	public static void main(String[] args)
	{
		AbstractClass abs=new AbstractClass();
		abs.speed();
	}
}