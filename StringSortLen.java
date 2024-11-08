package esakkiganesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSortLen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = { "java", "c", "javaScript", "HTML", "python", "c++"};
		List<String> str = Arrays.asList(s);
		String[] sorted = new String[s.length];
		int [] length = new int[s.length];
		for(int i = 0; i < s.length; i++)
		{
			length[i] = s[i].length();
			System.out.print(length[i]+" ");
		}
		for( int i = 0 ; i < length.length; i++)
		{
			for(int j = i+1; j < length.length; j++)
			{
				if(length[i] > length[j])
				{
					int smallest = length[j];
					length[j] = length[i];
					length[i] = smallest;
				}
			}
		}
		System.out.println();
		for( int i = 0; i < length.length ; i++)
		{
			System.out.print(length[i]+" ");
		}
		for( int i = 0 ; i < s.length ; i++)
		{
			for( int j = 0 ; j < str.size(); j++)
			{
				if(length[i] == (str.get(j).length())) 
				{
				    sorted[i] = str.get(j);
				  //  str.remove(j);
				    break;
					
				 }
			}
		 }
			
		
		System.out.println();
		for( int i = 0; i < sorted.length ; i++)
		{
			System.out.print(sorted[i]+" ");
		}
		      
		
		
		
		    /*    String[] words = {"java", "javaScript", "python", "c++" , "c" , "c#", "Html"};

		        // Sorting using a custom method
		        sortStringsByLength(words);

		        // Printing the sorted array
		        System.out.println("Sorted array by length (custom method): " + Arrays.toString(words));
		    }

		    public static void sortStringsByLength(String[] array) {
		        for (int i = 0; i < array.length - 1; i++) {
		            for (int j = i + 1; j < array.length; j++) {
		                if (array[i].length() > array[j].length()) {
		                    String temp = array[i];
		                    array[i] = array[j];
		                    array[j] = temp;
		                }
		            }
		        }  */
		    }	
	}
