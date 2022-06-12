
public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "sachin";
		String s2="tendulkar";
		String s4="sachin";
		String s5=new String("sachin");
		String s3 =s1.concat(s2);
		System.out.println(s3);
		System.out.println(s1.equals(s4));//compares the content
		System.out.println(s1.equals(s5));//compares the content
		System.out.println(s1==s4);//string literal stored in string pool
		System.out.println(s1==s5); 
		//== comparing the ash codes of their reference variable not the content i.e "sachin"
		//s5 refers to non pool
	
		System.out.println(s1.compareTo(s2));//compares the content if false=-1
		System.out.println(s1.compareTo(s4));//compares the content if true=0
		System.out.println(s1.compareTo(s5));//compares the content if true=0
	}

}
