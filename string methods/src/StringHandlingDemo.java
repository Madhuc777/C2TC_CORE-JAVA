
public class StringHandlingDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	String s1 = "Dr Ait";
	System.out.println("the length of s1 id" +s1.length());
	System.out.println("the index of s1 id is" +s1.indexOf('t'));
		String s2 = "wednesday";
		String s3 = s2.substring(1, 8);
		String s4 = s2.substring(4 );
		System.out.println(s3);
		System.out.println(s4);
		String s5 = "   hello              ";
		String s6= s5.trim();
		System.out.println(s6);
		String sentence = " Hi welcome to bengaluru";
		char ch[] = sentence.toCharArray();
		for(int i=0;i<sentence.length();i++)
		{
		System.out.print(ch[i]);
		}
		System.out.println();
		System.out.println(sentence.length());
		String s7 = "java project";
		String s8 = s7.toUpperCase();
		System.out.println(s8);
		String s9 = s7.toLowerCase();
		System.out.println(s9);
		String s10 = s7.concat(s5);
		System.out.println(s10);
		String s11 = s3.intern();
		System.out.println(s11);
		
	}

}
