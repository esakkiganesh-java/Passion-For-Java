package esakkiganesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] a = { 1,2,3,4,5} ;
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(a));
		System.out.println("Original List1" +list1);
		List<Integer> list2 = new ArrayList<Integer>();
		for( int i = 0 ; i < list1.size(); i++)
		{
			if(i > 1)
			{
				list2.add(list1.get(i));
				list1.remove(i);
				i--;	
			}
		}
		System.out.println( "New List1 " + list1 );
		System.out.println( "New List2 " + list2 );

	}

}
