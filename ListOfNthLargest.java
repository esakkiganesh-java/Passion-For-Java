package esakkiganesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListOfNthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Set<Integer> set = new TreeSet<>(Arrays.asList(a));
		List<Integer> list = new ArrayList<>(set);
		System.out.println(set);
		System.out.println(list);
        int key = 6;
        System.out.println(key+" th Largest element is "+list.get(list.size()-key));
	}

}
