package esakkiganesh;

public class ArrayLeftShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,40,50,60};
		int d = 2 ;
		int i = 0; 
		while(i < d)
		{
		   int temp = a[0];
		   for(int j = 0; j < a.length-1; j++)	
		   {
			   a[j] = a[j+1];
		   }
		   a[a.length-1] = temp;
		   i++;
		}
		
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+ " ");
		}
		

	}

}


	
