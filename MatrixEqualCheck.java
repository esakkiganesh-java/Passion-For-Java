package esakkiganesh;

public class MatrixEqualCheck {


public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= { {1,2,3},
				{5,2,3},
				{1,2,4} };
		int [][] b= { {1,2,3},
				{5,2,3},
				{1,2,5} };
		int result=CheckMatrix(a,b);
		if(result!=-1)
		{
			System.out.print("Two Matrix are Equal");
		}
		else {
			System.out.print("Two Matrix are not equal");
		}

	}
private static int CheckMatrix(int[][] a, int[][] b) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]!=b[i][j])
				{
			       return -1;
			       
			    }
			}
		}
	    return 0;
	}

}
