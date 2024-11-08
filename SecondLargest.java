package esakkiganesh;

public class SecondLargest {
	public static int secondlargest(int[] a) {
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		for( int i = 0; i < a.length; i++)
		{
			if(a[i] > largest)
			{
				secondlargest = largest;
				largest = a[i];
			}
			else if(a[i] > secondlargest && a[i] != largest)
			{
				secondlargest = a[i];
			}
		}
		if(secondlargest == Integer.MIN_VALUE)
		{
			System.out.println("no sceond Largest element in the Array");
			return -1;
		}
	  return secondlargest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 17, -3, 8, 6, 13, -9};
		int result = secondlargest(arr);
		printarray(arr);
		System.out.print("secondLargest : "+result);
		

	}

	private static void printarray(int[] arr) {
		// TODO Auto-generated method stub
		for( int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
	}

}
