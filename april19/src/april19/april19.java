package april19;
import java.lang.*;
import java.util.*;
class A extends Thread
{
	// synchronized execute any one thread first complete then move to another 
	// thread to execute it.
	// It execute only one thread at a time.
	public synchronized void run()
	{
		for (int i=0; i<=10; i++)
		{
			try
			{
				// Thread.currentThread -> It gives the current thread.
				// .grtName-> It give the name of the current thread
				System.out.println(Thread.currentThread()+": "+i);
				Thread.sleep(1000);
				
				
			}
			catch(Exception e)
			{
			}
			
		}
	}
}

class B extends Thread
{
	public void run()
	{
		for (int j=0; j<=10; j++)
		{
			try
			{
				System.out.println("            J: "+j);
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
			
		}
	}
}
public class april19 {

	public static void main(String args[] )
	{
		A a = new A();
		B b = new B();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(a);
		
		//a.start();
		//b.start();
		t1.start();
		t2.start();
		//setName
		t1.setName("Rama");
		t2.setName("Sita");
		
		for(int k=0; k<30; k++)
		{
			try
			{

				if(k==5)
					t1.suspend();
				if(k==10)
					t1.resume();
				if(k==14)
					System.out.println(t1.isAlive());
				if(k==20)
					t1.stop();
				if(k==25)
					System.out.println(t1.isAlive());
				System.out.println("                               k:"+k);
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
			}
		}
	}
}


// All the methods like start and run come from thread class from lang package.

//Suspend-> To stop the process for some time. But to resume it we have
// to specifically mention resume.

// GetName->

//isAlive-> To check weather thread is alive or not.

// sleep

// resume

//wait

/*Multithreading -> Two or more independents thread can run together 
 * and it doent block the user.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */









