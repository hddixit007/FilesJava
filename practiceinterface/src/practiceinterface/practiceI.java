package practiceinterface;


interface A
{
	abstract void abc(); 
}

class B implements A
{
	public void abc()
	{
		System.out.println("hi i am b");
	}
}

class C implements A
{
	public void abc()
	{
		System.out.println("hi i am c");
	}
}
public class practiceI {

	public static void main(String args[])
	{
		A b = new B();
		A c = new C();
		b.abc();
		c.abc();
	}
}
