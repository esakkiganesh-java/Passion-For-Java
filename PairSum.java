package esakkiganesh;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,7,11,15,3,6};
		int sum=8;
		int result= pairsum(a,sum);
		if(result==0) 
		{
           
		}
		else {
			System.out.print("no pairs");
		}

	}

	private static int pairsum(int[] a, int sum) {
		
		// TODO Auto-generated method s
	       for(int i=0;i<a.length;i++)//3,2,4
	       {
	    	for(int j=i;j<a.length;j++)
	    	{
	    	    if(sum ==(a[i]+a[j]))
	    	    {
	    		System.out.println(i+","+j);
	    		return 0;
	    	}
	    	}
	    	
	    	
	      }
		return 1;
	}
}
