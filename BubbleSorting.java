package esakkiganesh;

public class BubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      int[] arr = {15,13,14,11,10,-2};
		      bubbleSort(arr);
		      System.out.println("Sorted array:");
		      printArray(arr);
		    }
	private	static void bubbleSort(int[] arr) {
		    int n = arr.length;
		    for (int i = 0; i <=n-1; i++) {
		            for (int j = 0; j < n-i-1; j++) {
		                if (arr[j] > arr[j+1]) {
		                    int temp = arr[j];
		                    arr[j] = arr[j+1];
		                    arr[j+1] = temp;
		                }
		            }
		        }
		    }

		 
		private  static void printArray(int[] arr) {
		     int n = arr.length;
		     for (int i = 0; i < n; i++)
		        System.out.print(arr[i] + " ");
		    }
		

	}

