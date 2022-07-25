package array;

public class SearchArray {
	public static void main(String[] args)
	{
	int a[]= {2,4,1,8,4,9,6};
	int search_element=6;
	boolean flag=false;
	for(int i=0;i<a.length;i++)
	{
		if(search_element==a[i])
		{
			System.out.println("element found at "+i);
			flag=true;
			break;
		}
		if(flag==false)
		{
			System.out.println("element is not found");
		}
		
		}
			
	}}  	
		

