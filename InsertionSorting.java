package esakkiganesh;

public class InsertionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {25,36,45,78,999,25,1,3,45};
		insertionsort(a);
		printArray(a);
	}
	public static void insertionsort(int[] a) {
		for(int i=1;i<a.length;i++)
		{
			int key = a[i];//25,36,45,78,999,25,1,3,45
			int j = i-1;
			while(j>=0&&a[j]>key)
			{
				a[j+1]=a[j];
				j--;
				printArray(a);
				System.out.println("j ==" + j);
			}
			a[j+1]=key;
			
		}
		

	}
	
	
	public static void printArray(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
