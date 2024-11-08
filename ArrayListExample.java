package esakkiganesh;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList al=new ArrayList();
      al.add("E");
      al.add(27);
      al.add('A');
      System.out.println(al);
      Iterator itr=al.iterator();
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }
      
	}

}
