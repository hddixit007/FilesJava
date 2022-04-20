package day1assessment;

//import java.util.*;


class A 
{
	int i=8;
	void show()
	{
		System.out.println("show of A");
	}
}
class B extends A
{
	int i=5;
	void show()
	{
		//super.show();
		System.out.println("show of B");
	}
}
public class day1assessment {

	public static void main(String args[])
	{
		A a = new A();
		a.show();
		B b = new B();
		b.show();
		
		//for using runtime polymorphism and dynamic method dispatch, parent class must 
		//contain something similar with its child class like either method or variable;
		
		A ao = new B();
		ao.show();
		System.out.println(ao.i);
		
		
		//B bo = new A();   // This is wrong 
		
		
	}
}
