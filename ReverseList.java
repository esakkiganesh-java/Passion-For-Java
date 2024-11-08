package esakkiganesh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseList {

public static void main(String[] args) {
		
	List<Integer> list = new ArrayList<>();
         list.add(1);
         list.add(2);
         list.add(3);
     System.out.print(list); 
     Collections.reverse(list);
     System.out.println(list);
     for(int i=list.size()-1;i>=0;i--)
     {
    	 System.out.print(list.get(i)+" ");
     }
    	 
	
	}

}
