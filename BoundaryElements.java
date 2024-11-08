package esakkiganesh;

public class BoundaryElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a= { {4,2,7,7},
				{1,2,3,8},
				{6,2,1,6}, {1,3,5,8} };
		  for (int i=0;i<a.length;i++) { 
	            for (int j=0; j<a[i].length;j++) { 
	  
	                if (i==0||j==0||i==a.length-1
	                    ||j ==a[i].length -1) { 
	                    System.out.print(a[i][j]+" "); 
	                } 
	                else { 
	                  
	                    System.out.print("  "); 
	                } 
	            } 
	  
	            System.out.println(); 
	        } 
		}

	}


