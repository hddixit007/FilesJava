package april18;

// default, public, and protected members can be accessed from anywhere in a package.
// or within a package.
// private members can be accessed only inside that class else nowhere.
// 

class A
{
	protected int a=10;
	A()
	{
		System.out.println(a);
	}
	
	
}
class B
{
	B()
	{
		A ao = new A();
		System.out.println(ao.a);
	}
	
}

public class april18 {
	protected int x = 100;
	public static void main(String[] args)
	{
		//System.out.println("JSRHBM");
		//B b = new B();
		//A aa = new A();
		
	}

}

//public - 	all
//protected  -- derived clssesfrom other package.