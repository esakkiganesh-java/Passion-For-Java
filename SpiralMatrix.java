package esakkiganesh;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]s=new int[4][4];
		int mincol=0;
		int maxcol=3;
		int minrow=0;
		int maxrow=3;
		int value=1;
		while(value<=16)
		{
			for(int col=mincol;col<=maxcol;col++)
			{
				s[minrow][col]=value;
				value++;
			}
			for(int row=minrow+1;row<=maxrow;row++)
			{
				s[row][maxcol]=value;
				value++;
			}
			for(int col=maxcol-1;col>=mincol;col--)
			{
				s[maxrow][col]=value;
				value++;
			}
			for(int row=maxrow-1;row>=minrow+1;row--)
			{
				s[row][0]=value;
				value++;
			}
			mincol++;
			minrow++;
			maxcol--;
			maxrow--;
		}
		for(int row=0;row<4;row++)
		{
			for(int col=0;col<4;col++)
			{
				System.out.print(s[row][col]+"\t");
			}
			System.out.println();
		}

	}

}
