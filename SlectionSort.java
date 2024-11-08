package esakkiganesh;

import java.util.Arrays;

public class SlectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,4,5,6,3,9,0};
	   // Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int smallest;
					smallest=a[j];
					a[j]=a[i];
					a[i]=smallest;
			
				}
			}
		}
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
					
			}
		}
}
		

	


