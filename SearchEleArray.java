package esakkiganesh;

public class SearchEleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,8,2};
		int k=2;
		int result=ToSearchElement(a,k);
		if(result==0)
		{
			System.out.print(k+" is present in the array");
		}
		else {
			System.out.print(k+" is not present in the array");
		}

	}

	private static int ToSearchElement(int[] a,int k) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				return 0;
			}
		}
		return -1;
		
	}

}
