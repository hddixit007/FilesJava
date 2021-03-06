import java.util.*;
import java.lang.*;
public class CollectionDemo {

	public static void main(String args[])
	{
		// ArrayList -> It is a class inherited or extended from List Interface
		// ArrayList and LinkedLIst can store data of any data type.
		ArrayList l1 = new ArrayList(); // best for search opertion
		LinkedList a1 = new LinkedList(); // best for insertion and deletion
		
		HashSet s1  = new HashSet(); // no duplicate, no order
		
		
		l1.add(10);
		l1.add(20);
		
		// How to add to first position of linkedlist
		
		a1.addFirst(2000);
		
		// how to set value 500 to 3 position
		//a1.set(2, 500);
		
		l1.add("JSRHBM");
		l1.add('A');
		l1.add(true);
		//System.out.println(l1);
		
		a1.add(100);
		a1.add(200);
		a1.add("JSRHBM");
		a1.add('B');
		a1.add(false);
		//System.out.println(l1);
		
		
		// Iterate over the list using iterator or for loop or for each loop
		
		Iterator it = a1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
	}
}
