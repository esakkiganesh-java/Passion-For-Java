package esakkiganesh;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 4, 5, 90, 120, 80};
		for( int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int[] res = new int[a.length];
		int n = a.length;
		res[0] = 1;
		for( int i = 0; i < n - 1 ; i++)
		{
			if(a[i+1] < a[i] )
			{
				res[i+1] = 1;
			}
			else {
				int count = 1;
				for(int j = i+1; j > 0; j--)
				{
					if( a[i+1] > a[j-1])
						count++;
				}
				res[i+1] = count;
			}
		}
		for( int i = 0; i < n; i++)
		{
			System.out.print(res[i]+" ");
		}

	}

}
