class TestEncapsulation
{
	public String name;
	private int age;

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public void setName(String name)
	{
		this.name=name;
	}

	public void setAge(int age)
	{
		this.age=age;
	}
}

class Encapsulation
{
	public static void main(String[] args)
	{
		TestEncapsulation te=new TestEncapsulation();
		te.setName("Aniket");
		te.setAge(21);
		System.out.println(te.getName()+" "+te.getAge());
	}
}