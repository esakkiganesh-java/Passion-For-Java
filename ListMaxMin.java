package esakkiganesh;

import java.util.ArrayList;
import java.util.List;

public class ListMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer> list = new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         int min=Integer.MAX_VALUE;
         int max=Integer.MIN_VALUE;
         for( int i = 0; i < list.size(); i++)
         {
        	 if( list.get(i)> max)
        	 {
        		 max = list.get(i);
        	 }
        	 if( list.get(i)< min)
        	 {
        		 min = list.get(i);
        	 }
         }
         System.out.println(list);
         System.out.println("min element of List: "+min);
         System.out.println("max element of List: "+max);
     	}

}
