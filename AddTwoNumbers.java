package esakkiganesh;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 9,9,9,9,9,9,9};
		int[] b = {9,9,9,9};
		int n = 0;
		if(a.length >= b.length)
		{
			n = a.length;
		}
		else {
			n = b.length;
		}
		int[] c = new int[n];
		for(int i = 0; i < n; i++)
		{
			if( i > a.length - 1)
			{
				c[i] = 0 + b[i];
			}
			else if( i > b.length - 1)
			{
				c[i] = 0 + a[i];
			}
			else {
				c[i] = a[i] + b[i] ;
			}
		}
		for(int i = 0; i < n; i++)
		{
			System.out.print(c[i]+" ");
		}

	}

}
