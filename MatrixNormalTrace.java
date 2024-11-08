package esakkiganesh;

public class MatrixNormalTrace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= { {1,4,4},
		{2,3,7},
		{0,5,1} };
		int normal=0;
		int trace=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[0].length;j++)
		{
		    normal=(normal+(a[i][j]*a[i][j]));
		    if(i==j)
		    {
		    	trace=trace+a[i][j];
		    }
		}
	}
	int normal1=(int)Math.sqrt(normal);
	System.out.println("Normal: "+normal1);
	System.out.print("Trace: "+trace);
   }

}
