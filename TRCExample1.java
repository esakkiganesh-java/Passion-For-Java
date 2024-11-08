package esakkiganesh;

public class TRCExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	  int n=5;
	  for(int i=1;i<=n;i++)
	  {
		  
		     for(int space=1;space<=(n-i);space++)
		     {
			  System.out.print(" ");		  
	         }
		    for(int col1=1;col1==i;col1++)
		     {
			  System.out.print(col1);
		     }
		    
		    System.out.println();
	  }

	}

}
