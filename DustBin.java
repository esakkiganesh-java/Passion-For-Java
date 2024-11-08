package esakkiganesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DustBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // 1.string len 
	/*	String s = "hello";
		String s2= "java";
		System.out.println(s.length()+s2.length());
		if(s.length()>=s2.length())
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		System.out.print(s+" "+s2);
      */
   //2.string sorting usting string length
	/*	List<String> str = new ArrayList<String>();
	      str.add("java");
	      str.add("programming");
	      str.add("c");
	      str.add("html");
	      str.add("python");
	      str.add("javascript");
	      str.add("c++");
	      
	      System.out.println(str);
	      
	 List<String> list = new ArrayList<String>(str.size());
	 list.add(str.get(0));
	 for(int i = 0; i < str.size() ; i++)
	 {
     if(i > 0) 
     {
		 if((str.get(i).length()) < (list.get(i-1).length()))
		 {
			 list.addFirst(str.get(i));
		 }
		 else
		 {
			 list.addLast(str.get(i));
		 }
		
	    }
	 }
	 System.out.print(list);
   */
   //3.Array of String sorting using String length
		
	/*    String[] s = { "java", "c", "javaScript", "HTML", "python", "c++" };
		List<String> str = new ArrayList<>(Arrays.asList(s)); // Convert to ArrayList for easier removal
		String[] sorted = new String[s.length];
		int[] length = new int[s.length];

		        // Fill the length array with the lengths of the strings
		for (int i = 0; i < s.length; i++) {
		     length[i] = s[i].length();
		     System.out.print(length[i] + " ");
		}

		// Sort the length array and keep track of the indices
		for (int i = 0; i < length.length; i++) {
		     for (int j = i + 1; j < length.length; j++) {
		         if (length[i] > length[j]) {
		              int temp = length[j];
		               length[j] = length[i];
		               length[i] = temp;
		         }
		     }
	   }

	    System.out.println();
		for (int i = 0; i < length.length; i++) {
		     System.out.print(length[i] + " ");
		}

		// Sort the strings based on their lengths
	    for (int i = 0; i < s.length; i++) {
		     for (int j = 0; j < str.size(); j++) {
		       if (length[i] == (str.get(j).length())) {
		          sorted[i] = str.get(j);
		          str.remove(j);  // Safe removal from ArrayList
		          break; // Break after finding and removing the matching string
		       }
		     }
		}

		   System.out.println();
		   for (int i = 0; i < sorted.length; i++) {
		       System.out.print(sorted[i] + " ");
		   }
      }  
	}*/
	/*int[] a = { 7, 1, 5, 3, 6, 4};
		int ans = 0;
		for( int i = 0; i < a.length -1 ; i++)
		{
		   for( int j = i + 1 ; j < a.length; j++)
		   {
			   if(a[j] > a[i])
			   {
				  int max = Integer.MIN_VALUE;
				  for(int k = j; k < a.length -1; k++ )
				  {
					  if(a[k+1] < a[k] )
					  {
						 max = a[k];
					  }
					  else {
						  max = a[k+1];
					  }
				}
				System.out.println(max);
				ans = max - a[i];
				break;
			   }
			
		   }
			
		}
       System.out.println(ans);
	} */
		  public double myPow(double x, int n) {
		        double op = 1;
		        if(n > 1){
		         for(int i = 0; i < n; i++)
		         {
		            op = x * op ;
		         }
		         return op; 
		        }
		        if(n < 0)
		        {
		            int N = n * (-1);
		            for(int i = 0; i < N; i++)
		            {
		                op = op * x;
		            }
		           op = 1 / op ;
		          return op;
		        }
		        if( n == 0)
		        {
		            op =  1;
		            return op;
		        }
		    op = x;
		    return op;
		   }
}

	
	
