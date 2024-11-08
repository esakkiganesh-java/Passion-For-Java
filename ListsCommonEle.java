package esakkiganesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsCommonEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] a = { 1, 2, 3, 4, 5};
		Integer [] b = { 1, 3, 5, 7};
		List<Integer> list1 = new ArrayList<>(Arrays.asList(a));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(b));
		System.out.println("List 1 :"+list1);
		System.out.println("List 2 ;"+list2);
		System.out.print("Common elements of list1 and list2 : ");
		for( int i = 0; i < list1.size(); i++)
		{
			for( int j = 0; j < list2.size(); j++)
			{
			  if(i > (list1.size()-1)|| j > (list2.size()-1 ))
			  {
				break;
			  }
			  if((list1.get(i)).equals(list2.get(j)))
			  {
				System.out.print(list1.get(i)+" ");
			  }
		   }
		} 

	}

}
