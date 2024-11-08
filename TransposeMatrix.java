package esakkiganesh;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a= { {1,2,3},
				{4,5,6},
				{7,8,9} };
		int[][]tr=new int[3][3];
		for(int row=0;row<3;row++)
		{
			for(int col=0;col<3;col++)
			{
				tr[row][col]=a[col][row];
			}
		}
		for(int i=0;i<tr.length;i++)
		{
			for(int j=0;j<tr.length;j++)
			{
				System.out.print(tr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
