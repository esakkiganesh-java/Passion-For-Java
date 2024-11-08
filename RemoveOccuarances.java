package esakkiganesh;

public class RemoveOccuarances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,10,30,50,10};
		int key=10;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				a[i]=0;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0) {
			System.out.print(a[i]+" "); }
		}

	}

}
