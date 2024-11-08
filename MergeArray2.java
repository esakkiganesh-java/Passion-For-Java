package esakkiganesh;

public class MergeArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 4, 7, 9, 11};
		int[] b = { 2, 3, 5, 10};
		int[] c = new int[a.length + b.length];
	    for(int i = 0; i < c.length; i++)
	    {   
	    	innerloop:
	    	for(int j = i; j < a.length; j++)
	    	{
	    		for(int k = i;k < b.length; k++)
	    		{
	    			if(a[j] < b[k])
	    			{
	    				c[i] = a[j];
	    				break innerloop;
	    			}
	    			else {
	    				c[i] = b[k];
	    				break innerloop;
	    			}
	    		}
	    	}
	    }
	 for(int i = 0; i < c.length; i++)
	 {
		 System.out.print(c[i]+" ");
	 }
   }

}
