	//it allows duplicate values

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list= new ArrayList ();
		list.add("sachin");
		list.add("dhoni");
		list.add("kohli");
		list.add("yuvraj");
		list.add("dhoni");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
		
			System.out.println(itr.next());
			
		}
		System.out.println(list.get(4));
		System.out.println(list.set(1, "msd"));
		System.out.println(list);

	}

}
