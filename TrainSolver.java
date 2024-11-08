package esakkiganesh;

import java.util.ArrayList;
import java.util.List;

public class TrainSolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {910,915,918,940,945};
        int[] b= {920,935,940,950,1000};
        List<Integer> platform = new ArrayList<Integer>();
		//int[] a= {900,1100,1235};
		//int[] b= {1000,1200,1240};
       // System.out.println(platform.size());
         for(int i=0;i<a.length;i++)
         {                          
        	 System.out.println(a[i] + " " + b[i]);
        	 boolean flag = true;
        	 for(int j = 0; j < platform.size(); j++) {
        		 if(platform.get(j) <= a[i]) {
        			 platform.set(j,b[i]);
        			 flag = false;
        			 break;
        		 }
        	}
        	 if(flag) {
        		 platform.add(b[i]);
        	 }
        	 
          
         }
     
         
         
         System.out.print(platform.size()); 
         
         

	}

}
