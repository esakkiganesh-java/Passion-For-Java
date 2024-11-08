package esakkiganesh;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Original array:");
        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.println("\nSorted array:");
        printArray(arr);
    }


	 public static void quickSort(int[] arr, int low, int high) {
		        if (low < high) {
		            // Partition the array
		            int pi = partition(arr, low, high);

		            // Recursively sort elements before partition and after partition
		            quickSort(arr, low, pi - 1);
		            quickSort(arr, pi + 1, high);
		        }
		    }

		    public static int partition(int[] arr, int low, int high) {
		        // Choose the rightmost element as pivot
		        int pivot = arr[high];

		        // Index of smaller element
		        int i = low - 1;

		        for (int j = low; j < high; j++) {
		            // If current element is smaller than or equal to pivot
		            if (arr[j] <= pivot) {
		                i++;

		                // Swap arr[i] and arr[j]
		                int temp = arr[i];
		                arr[i] = arr[j];
		                arr[j] = temp;
		            }
		        }

		        // Swap arr[i+1] and arr[high] (or pivot)
		        int temp = arr[i + 1];
		        arr[i + 1] = arr[high];
		        arr[high] = temp;

		        return i + 1;
		    }

		    // Example usage
		/*    public static void main(String[] args) {
		        int[] arr = {10, 7, 8, 9, 1, 5};
		        System.out.println("Original array:");
		        printArray(arr);
		        quickSort(arr, 0, arr.length - 1);
		        System.out.println("\nSorted array:");
		        printArray(arr);
		    } */

		    // Utility function to print array
		    public static void printArray(int[] arr) {
		        for (int value : arr) {
		            System.out.print(value + " ");
		        }
		        System.out.println();
		    }
		}


	


