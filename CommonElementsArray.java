package esakkiganesh;

public class CommonElementsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,12};
		int[] b= {2,5,7,15,6,12};
		int[] c=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					c[i]=a[i];
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>0)
			{
			System.out.print(c[i]+" "); }
		}

	}

}
