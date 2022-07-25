import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll = new LinkedList ();
		ll.add(10);
		ll.add(new Integer(5));
		ll.add(new String("hello"));
		ll.addFirst(25);
		Iterator it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		ll.remove();
		ll.removeLast();
		System.out.println("After removing elements");
		System.out.println(ll);
	}

}
