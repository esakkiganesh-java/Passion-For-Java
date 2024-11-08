package esakkiganesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListRemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String[] s = { "apple" , "applejuice" , "juice" , "ice" , "apple" , "ice" };
     List<String> fruits = new ArrayList<>(Arrays.asList(s));
     System.out.println(fruits);
     for( int i = 0 ; i < fruits.size(); i++)
     {
    	 for( int j = i+1; j < fruits.size(); j++)
    	 {
    		 if (fruits.get(i).equals(fruits.get(j))) 
    		 {
    			fruits.remove(j);
    			//j--;
    		 }
    	 }
     }
     System.out.println(fruits);
     Set<String> fruit = new TreeSet<String>();
     for( int i = 0; i < fruits.size(); i++)
     {
    	 fruit.add(fruits.get(i));
     }
   //  System.out.println(fruit);
	}

}
