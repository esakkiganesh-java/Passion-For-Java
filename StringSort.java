package esakkiganesh;

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="esakki ganesh";
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					char smallest;
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
