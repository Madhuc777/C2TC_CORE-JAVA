
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "Sachin,Sachin,god of cricket";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s3.replace("Sachin", "MS Dhoni"));
		String s4 ="kohli                ";
		System.out.println(s4.trim());
		System.out.println(s4);
		System.out.println(s3.contains("god"));
		
		
		
		
		
		
		
		
		
	}

}
