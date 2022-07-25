package stack;
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		s.push(5);
		s.push(8);
		s.push(7);
		s.push(1);
		System.out.print(s);
		//s.pop();
		//s.pop();
		System.out.println();
		//System.out.println(s);
		s.peek();
		System.out.println(s.peek());
		boolean status=s.isEmpty();
		System.out.println(status);
		int index_found=s.search(5);
		System.out.println(index_found);
		

	}

}
