import java.util.*;
import java.io.*;
class A extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("I is:"+ i);
			//Thread.sleep(1000);
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for(int j=0; j<10; j++)
		{
			System.out.println("                      J is:"+ j);
		}
	}
}

public class ThreadL {
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		//b.start();
		//a.start();
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		t1.start();
		t2.start();
		
	}
}
