package esakkiganesh;

import java.util.Arrays;

public class DominentElement{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int []a= {4,3,5,5,6,6,6,7,7,7,8,8,8};
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
		        System.out.print("Array: ");
				for(int i=0;i<a.length;i++)
				{
					System.out.print(a[i]);
						
				}
	     	int[] freq=new int[a.length];
			for(int i=0;i<a.length;i++)
			{
				int num=a[i];
				int count=1;
				for(int j=i+1;j<a.length;j++)
				{
					if(num==a[j]) {
						count++;
						freq[j]=-1;
					}
						
				}
				    if(freq[i]!=-1)
					{
						freq[i]=count;
					}
				}
			int m=Integer.MIN_VALUE;
			int s=0;
			for(int i=0;i<a.length;i++)
			{
				if(freq[i]>m)
				{
				 m = freq[i];
				 s=i;
				}
			}
			int C=0;
			for(int i=0;i<freq.length;i++)
			{
				if(m==freq[i])
					C++;
			}
			System.out.println();
			if(C==1)
			{
				System.out.println("Dominent element");
			}
			else {
				System.out.println("Not a Dominent element");
			}
			System.out.println(m+" times occurs in "+s+" position element");
	}
	}
