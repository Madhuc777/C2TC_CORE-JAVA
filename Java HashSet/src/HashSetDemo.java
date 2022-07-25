import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 */

/**
 * @author HP
 *
 */
public class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs=new HashSet();
		hs.add(34);
		hs.add("kohli");
		hs.add("rohith");
		hs.add(34);
		System.out.println("initial list of elements" +hs);
		hs.remove("kohli");
		System.out.println("after removin elements" +hs);
	
		HashSet h=new HashSet();
		h.add("sachin");
		h.add(10);
		
		hs.addAll(h);
	
			System.out.println("the elements are"+ hs);
		hs.clear();
		System.out.println("after removing all elements");
		System.out.println(hs);
	
	}
	

}
