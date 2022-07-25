import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * 
 */

/**
 * @author HP
 *
 */
public class SortingArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 List <String> list =new ArrayList <String> ();
		 
		 list.add("msd");
		 list.add("sachin");
		 list.add("kohli");
		 list.add("rohith");
		 Collections.sort(list);
		 System.out.println("after sorting");
		 Iterator itr=list.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		 System.out.println();
		 
		 ArrayList<Integer> al= new ArrayList<Integer>();
		 
		 al.add(4);
		 al.add(9);
		 al.add(1);
		 al.add(3);
		 
		 Collections.sort(al);
		 System.out.println("the sorted numbers are");
		
		for(Integer numbers:al)
		{
			System.out.println(numbers);
		}

}
}