package esakkiganesh;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr = {2, 3, 4, 10, 40, 60};
    int target = 60;
    int result = binarySearch(arr,target);
    if (result != -1) {
		System.out.println(target+" found at index " + result);
		}
	else {
		  System.out.println(target+" not found");
		 }
		}

public static int binarySearch(int[] arr, int target) {
      int left = 0;
	  int right = arr.length - 1;

		while (left <= right) {
		  int mid = (left + right) / 2;
		       if (arr[mid] == target) {
		           return mid;
		        }
		        if (arr[mid] < target) {
		            left = mid + 1;
		        }
		        else {
		            right = mid - 1;
		            }   
		        }
		        return -1;
		    }

		}

		