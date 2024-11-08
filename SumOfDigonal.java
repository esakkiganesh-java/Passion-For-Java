package esakkiganesh;

public class SumOfDigonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= { {6,7,3,4},
				{8,9,2,1},
				{1,2,9,6},
				{6,5,7,2}};
		int sum=0;
		int sum2=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(i==j)
				{
				sum=sum+a[i][j];
				}
				if(i+j==(a[0].length-1))
				{
					sum2=sum2+a[i][j];
				}
			}
		}
		System.out.println("Sum Of Dig: "+sum);
		System.out.print("Sum of 2Dig: "+sum2);

	}

}
