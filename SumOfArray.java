package esakkiganesh;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,3,4,-5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=a[i]+sum;
		}
		System.out.print(" Sum of the Arraay: "+sum);

	}

}
