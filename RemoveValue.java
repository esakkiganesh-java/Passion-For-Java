package esakkiganesh;
import java.util.ArrayList;
public class RemoveValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr = { 0, 1, 2, 2, 3, 0, 4, 2};
	int val = 2;
	int sol = solution(arr, val);
	for(int i = 0; i < sol; i++)
	{
		System.out.print(arr[i]+" ");
	}
	}

	public static int solution(int[] arr,int val) {
		int i = 0;
		for(int j = 0; j < arr.length; j++)
		{
			if( arr[j] != val)
			{
				arr[i] = arr[j];
				i++;
			}
		}
	 return i;
	}
}
