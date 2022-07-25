package array;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={7,8,3,6,5,9,0,2,1};
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i] +" ");
}
Arrays.sort(a);
System.out.println();
for(int i=0;i<a.length;i++)
{
	System.out.print(a[i] + " ");
}


	}

}
