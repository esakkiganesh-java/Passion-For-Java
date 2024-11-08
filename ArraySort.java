package esakkiganesh;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {13,5,7,8,2,9};
		int[] b=new int[a.length];
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
				  temp=a[i];
				  a[i]=a[j];
				  a[j]=temp;
				}
			}
		}
		System.out.print("sorted arrey : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<b.length;i++)
		{
		   if(i%2==0)
		   {
			   b[i]=a[i];
			   System.out.print(b[i]+" ");
		   }
		}
		for(int i=b.length-1;i>=0;i--)
		{
			if(i%2!=0)
			{
				b[i]=a[i];
				System.out.print(b[i]+" ");
			}
		
		}

	}

}
