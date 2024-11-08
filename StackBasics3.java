package esakkiganesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StackBasics3 {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 4, 3, 2, 1 };
		List<Integer> list = new ArrayList<>();
	   // for(int i=0;i<arr.length;i++)
		for(int i=arr.length-1;i>=0;i--)
	    {
	    	list.add(arr[i]);
	    }
	    System.out.println(list);
	    for(int i = list.size()-1 ; i>=0 ; i--)
	    {
	    	System.out.print(list.get(i)+" ");
	    }
	    
	    
	}

}
