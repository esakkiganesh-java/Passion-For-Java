package esakkiganesh;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListRemDuplicate {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] a = { 4, 2, 2, 3, 2, 3, 7, 4};
		List<Integer> list = new LinkedList<>(Arrays.asList(a));
		System.out.println(list);
		for( int i = 0; i < list.size()-1 ; i++)
		{
		    for( int j = i+1; j < list.size(); j++)
		    {
		    	if(list.get(i).equals(list.get(j)))
		    	{
		    		list.remove(j);
		    		j--;
		    	}
		    }
		}
		System.out.println(list);

	}

}
