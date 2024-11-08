package esakkiganesh;

public class TRCExample1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int n=5;
	  int value=1;
	  int base=n+1;
	  int count=0;
	  for(int row=0;row<n;row++)
	  {
		  for(int col=0;col<n;col++)
		  {
			  if((row+col)<(n-1))
			  {
			   System.out.print("  ");
			  }
			  else
			  {
				  if(row==0)
				  {
					  System.out.print(value+" ");
					  value++;
				  }
				  else
				  {
				   if((row+col)==(n-1))
						   {
					       System.out.print(base+" ");
					       count=base;
					       base=base+(col+1);
						   }
				   				   }
			       if((row+col)==n)
			       {
			    	   System.out.print(count-col+" ");
			       }
			       if((row+col)==(n+1))
			       {
			    	   System.out.print(count-col-1+" ");
			       }
			  }
			  
		  }
		  System.out.println();
	  }

	}
	}



