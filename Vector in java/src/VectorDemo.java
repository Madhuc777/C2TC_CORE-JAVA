import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector <String> v = new Vector<String> (3);
		
		v.add("tiger");
		v.add("lion");
		v.add("cheetah");
		System.out.println("size is" + v.size());
		System.out.println("default capacity is" + v.capacity());
		System.out.println("vector elements are" +v);
		
		v.addElement("cat");
		v.addElement("dog");
		v.addElement("deer");
		System.out.println("vector elements after addition are" +v);
		System.out.println("size" +v.size());
		System.out.println("default capacity" +  v.capacity());
		
		if(v.contains("tiger")) {
			System.out.println("tiger is present at index:" +v.indexOf("tiger"));
		}
		System.out.println("the animal present at the last index is :" +v.lastElement());
	
		v.remove(2);
		System.out.println(v);
	}

}
