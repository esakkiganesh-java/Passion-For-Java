package esakkiganesh;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] a = { 1, 2, 3, 4, 5};
		List<Integer> list = new LinkedList<>(Arrays.asList(a));
		System.out.println(list);
		System.out.println(list.reversed());
		for( Integer ints : list)
		{
			System.out.print(ints+" ");
		}
			


	}

}
