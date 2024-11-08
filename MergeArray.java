package esakkiganesh;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,4,5,7,9};
		int[] b= {2,4,6,8};
		int a1=a.length;
		int b1=b.length;
		int c1=a1+b1;
		int[] c= new int[c1];
      for(int i=0;i<a.length;i++)
      {
    	  c[i]=a[i];
      }
      for(int i=0;i<b.length;i++)
      {
    	 c[a1+i]=b[i]; 
      }
      for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					int smallest;
					smallest=c[j];
					c[j]=c[i];
					c[i]=smallest;
				}
			}
		}  
		
      for(int i=0;i<c1;i++)
      {
    	  System.out.print(c[i]+" ");
      }
      System.out.println();
      System.out.println("length : "+c.length);
      if(c.length % 2 == 0)
      {
    	  double mid = c[c.length/2] + c[(c.length/2)-1];
    	  mid = mid / 2;
    	  System.out.println(mid);
      }
      else
      {
    	  int mid = c[c.length/2];
    	  System.out.println(mid);
      }
      
	}

}
