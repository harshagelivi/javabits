package basics;

public class Derived extends Base
{
	public static void staticShow()
	{
		System.out.println("in static show in derived");
	}

	public void show()
	{
		System.out.println("in derived");
	}

}
