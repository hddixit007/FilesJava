package one;
import java.sql.*;
import java.util.*;
import java.io.*;

class A
{
	void abc() throws FileNotFoundException, SQLException, NullPointerException
	{
		for(int i=0; i<10; i++)
		{
			if(i==15) throw new NullPointerException();
			if(i==7) throw new ArrayIndexOutOfBoundsException();
			if(i==10) throw new NumberFormatException();
			if(i==12) throw new SqlException();
			if(i==8) throw new FileNotFoundException();
			
			System.out.println("I: "+ i);
		}
	}
}

public class one1 {
	public static void main(String args[])
	{
		try
		{
			A a = new A();
			a.abc();
		}
		catch(NullPointerException np)
		{
			System.out.println("I: "+ i);
		}
		catch(NumberFormatException nf)
		{
			System.out.println("I: "+ i);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("I: "+ i);
		}
		catch(SQLException sq)
		{
			System.out.println("I: "+ i);
		}
		catch(FileNotFoundException f)
		{
			System.out.println("I: "+ i);
		}
		finally
		{
			System.out.println("Thank You");
		}
	}
	
	
}



















/*public static void main(String args[])
{
	m1();
}
public static void m1()
{
	m2();
}

public static void m2()
{
	try
	{
		File f = new File("abc.txt");
		FileReader fr = new FileReader(f);
	}


	catch(FileNotFoundException fnf)
	{
		System.out.println("file not found");
	}

}*/
//