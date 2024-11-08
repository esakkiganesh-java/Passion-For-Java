package esakkiganesh;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n = 5;
        int[][] arr = new int[n][n];
        int num = 1;
        for( int col = n - 1; col >= 0; col-- ) {
        	for( int row = col; row < n; row++)
        	{
        		arr[row][col] = num++;
        	}
        }
        for( int i = 0; i < n; i++) {
        	for( int j = 0; j < n; j++) {
        		if(arr[i][j] != 0) {
        			System.out.print(arr[i][j]+" "); }
        		else {
        			System.out.print(" "); }
        	}
        	System.out.println();
        }
        
	}

}
