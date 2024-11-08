package esakkiganesh;

import java.util.ArrayList;
import java.util.List;

public class ListRemovDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> list = new ArrayList<>();
      list.add(7);
      list.add(2);
      list.add(0);
      list.add(0);
      list.add(5);
      list.add(8);
      list.add(7);
      System.out.println("List before: "+list);
      for( int i =0 ;i < list.size()-1; i++)
      {
    	  for( int j = i+1 ; j < list.size(); j++)
    	  {
    		  if( list.get(i) == list.get(j) )
    		  {
    			  list.remove(j);
    		  }
    	  }
      }
      System.out.print("List after: "+list);
   
	}

}
