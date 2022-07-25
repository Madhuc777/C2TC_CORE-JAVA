import java.util.*;

public class ArrayDeque  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> deque=new ArrayDeque<String>();  
		    deque.offer("arvind");  
		    deque.offer("vimal");  
		    deque.add("mukul");  
		    deque.offerFirst("jai");  
		    System.out.println("After offerFirst Traversal...");  
		    for(String s:deque){  
		        System.out.println(s);  
		    }   
		    deque.pollLast();  
		    System.out.println("After pollLast() Traversal...");  
		    for(String s:deque){  
		        System.out.println(s);  
		    }  
		}  
		}  
