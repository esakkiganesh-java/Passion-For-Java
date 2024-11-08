package esakkiganesh;

public class FirstToLastCol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= { {1,2,3},
				{5,6,7},
				{2,3,7},
				 };
		int[][] b=new int[a.length][a[0].length];
		int minrow=0;
		int maxrow=a.length-1;
		int mincol=0;
		int maxcol=a[0].length-1;
		for(int row=minrow;row==minrow;row++)
		{
			for(int col=maxcol;col>=mincol;col--)
			{
				System.out.print(a[row][col]+" ");
			}
			
		
		}
		System.out.println();
		for(int row=minrow+1;row<maxrow;row++)
		{
			for(int col=maxcol;col>=mincol;col--)
			{
				System.out.print(a[row][col]+" ");
			}
		
		}
		System.out.println();
	   for(int row=maxrow;row<=maxrow;row++)
		{
			for(int col=maxcol;col>=mincol;col--)
			{
				System.out.print(a[row][col]+" ");
			}
		
		} 
		System.out.println();
	}

}
