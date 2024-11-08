package esakkiganesh;

public class StockMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 7, 6, 4, 3, 1};
		int ans = 0;
		Outerloop:
		for( int i = 0; i < a.length -1 ; i++)
		{
		   for( int j = i + 1 ; j < a.length; j++)
		   {
			   if(a[j] > a[i])
			   {
				  int max = Integer.MIN_VALUE;
				  for(int k = j; k < a.length -1; k++ )
				  {
					  if(a[k+1] < a[k] )
					  {
						 max = a[k];
					  }
					  else {
						  max = a[k+1];
					  }
				}
				System.out.println(max);
				ans = max - a[i];
				break Outerloop;
			   }
			
		   }
			
		}
       System.out.println("ans : "+ans);
	}

}
