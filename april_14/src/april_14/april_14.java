package april_14;

class A
{
	int a = 1000;
	A()
	{
		System.out.println("A called");
	}
	void calc(int ... n)  // it consider it as sequence of values
	{
		for(int item: n)
		{
			//System.out.println();
		}
	}
}
class B extends A
{
	int a =10;
	String name = "Harshit Dixit";
	B()
	{
		System.out.println("B called");
	}
	
}


public class april_14 {
	public static void main(String args[])
	{
		
		// Variable length arguments
				B b = new B();
				b.calc(10,20,30,40,50,60,70);
				//System.out.println(b.a);
				
				A ao = b;
				System.out.println(ao.a);
				A a1 = new A();
				System.out.println(a1.a);
				/*int []arr = {1,2,3,4,5};
				 * int [][]a = {
				 
				{10,20,30,40},
				{1,2,3,4},
				{3,6,80,21}};
		System.out.println("done");
		
		/*for(int item: arr)
		{
			System.out.println(item);
		}
		
		for(int ele[]: a)
		{
			for(int k: ele)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}*/
		
		
	}

}
