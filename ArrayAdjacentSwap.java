package esakkiganesh;

public class ArrayAdjacentSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr = { 11, 14, 15, 17};
		 for(int i = 0 ; i < arr.length-1; i++)
		 {
			 for( int j = i+1; j < arr.length; j++)
			 {
				 if((arr[i]+1)==(arr[j]))
				 {
					 int temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
					 i++;
					 
				 }
			 }
		 }
		 for ( int i = 0 ; i < arr.length; i++)
		 {
			 System.out.print(arr[i]+" ");
		 }

	}

}
