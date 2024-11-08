package esakkiganesh;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,45,4,5,6,78,};
		int[] b= {3,4,5,6,7,78};
		int a1=a.length;
		int b1=b.length;
		int c1=a1+b1;
		int[] c=new int[a.length+b.length];
		System.out.print("Intersection: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
		System.out.println();
      System.out.print("Union of Array:");
      for(int i=0;i<a1;i++)
      {
    	  c[i]=a[i];
      }
      for(int i=0;i<b1;i++)
      {
    	  c[a1+i]=b[i];
      }
      for(int i=0;i<c1;i++)
      {
    	 for(int j=i+1;j<c1;j++)
    	 {
    		 if(c[i]==c[j])
    		 {
    			 c[j]=0;
    		 }
    	 }
      }
      for(int i=0;i<c1;i++)
      {
    	  if(c[i]>0)
    	  {
    	  System.out.print(c[i]+" ");
    	  }
      }
      
	}

}
