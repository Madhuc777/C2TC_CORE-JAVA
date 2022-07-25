import java.util.LinkedHashSet;

public class JavaLinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Java");
		lhs.add("t");
		lhs.add("point");
		lhs.add("is a good website");
		lhs.add("t");
		System.out.println("the hashset is" +lhs);
		System.out.println(lhs.remove("Java"));
		System.out.println(" after removing elements" +lhs);
		System.out.println(lhs.remove("hello"));
	}

}
