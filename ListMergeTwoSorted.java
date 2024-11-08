package esakkiganesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMergeTwoSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Integer [] a = { 1, 3, 5, 6};
		Integer [] b = { 2, 4, 7, 8};
		List<Integer> list1 = new ArrayList<>(Arrays.asList(a));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(b));
		List<Integer> merged = new ArrayList<>(list1.size()+list2.size());
        for ( int i = 0 ; i < merged.size(); i++)
        {
        	if((list1.get(i)) > (list2.get(i)))
        	{
        		merged.add(list2.get(i));
        	}
        	else {
        		merged.add(list1.get(i));
        	}
        }
	
	System.out.println("List1 :"+list1);
	System.out.println("List2 :"+list2);
	System.out.println("Merged : "+merged); */
		
	
	Integer[] a = {1, 5, 6};
    Integer[] b = {2, 4, 7, 8};
    List<Integer> list1 = new ArrayList<>(Arrays.asList(a));
    List<Integer> list2 = new ArrayList<>(Arrays.asList(b));
    List<Integer> merged = new ArrayList<>(list1.size() + list2.size());

	int i = 0, j = 0;
    while (i < list1.size() && j < list2.size()) {
		    if (list1.get(i) <= list2.get(j)) {
		          merged.add(list1.get(i));
		             i++;
		    } else {
		           merged.add(list2.get(j));
		              j++;
		            }
		      }
	 while (i < list1.size()) {
		  merged.add(list1.get(i));
		      i++;
		   }

	 while (j < list2.size()) {
		   merged.add(list2.get(j));
		        j++;
		   }

		  System.out.println("List1: " + list1);
		  System.out.println("List2: " + list2);
		  System.out.println("Merged: " + merged);
	}

}
