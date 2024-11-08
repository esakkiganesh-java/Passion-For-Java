package esakkiganesh;
import java.util.*;

import java.util.Arrays;

public class Practice1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		// TODO Auto-generated method stub
 /*	int[] a= {11,14,15,17};
		int temp1=a[2];
		a[2]=a[1];
		a[1]=temp1;
		//int temp2=a[2];
		//a[2]=a[3];
		//a[3]=temp2;
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i] +" ");
	    } */
		
        int[] a= {3,7,1,2,8,4,5};
      //  Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
        	System.out.print(a[i]);
        
        }
        System.out.println();
		int sum=10;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++) {
				for(int k=j;k<a.length;k++) {
					if((a[i]+a[j]+a[k])==sum)
					{
					 if(a[i]!=a[j]&&a[i]!=a[k]&&a[j]!=a[k]) {
							
						System.out.println(a[i]+" " +a[j]+" "+a[k]);
					 
				     }
					 
				   }
			   }
	        }
       }
		
		/*int[] a= {910,915,918,940,945};
        int[] b= {920,935,940,950,1000};0
        List<Integer> platform = new ArrayList<Integer>();
		//int[] a= {900,1100,1235};
		//int[] b= {1000,1200,1240};
        
         for(int i=0;i<a.length;i++)//a=900,940,950,1100,1500,1800
         {                          //b=910,1120,1130,1200,1900,2000;
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
     
         
         
         System.out.print(platform.size()); */
         
         
     /*   int []a= {4,3,5,5,5,6,6,6,7,7,7,7};
     	Arrays.sort(a);	
     	int maxNum=Integer.MIN_VALUE;
     	for(int i=0;i<a.length;i++)
     	{
     		if(a[i]>=maxNum)
     		{
     			maxNum=a[i];     		}
     	}
     	System.out.println(" max num of Array: "+ maxNum);
     	int[] freq=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			int num=a[i];
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(num==a[j]) {
					count++;
					freq[j]=-1;
				}
					
			}
				if(freq[i]!=-1)
				{
					freq[i]=count;
				}
			}
			
		for(int i=0;i<a.length;i++)
		{
			if(freq[i]>0)
			{
			//	System.out.println(a[i]+ " occurs " + freq[i] + " times ");
			}
		}
		int position=0;
		int max= Integer.MIN_VALUE;
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]>max)
			{
				max=freq[i];
				position=i;
				
			}
		
		}
		//System.out.println(max+ " times comes at "+position+" position ");
        System.out.println(" most Repeting no: "+a[position]); 
	
		if(maxNum==a[position])
		{
			System.out.println(" dominent number");
		}
		else {
			System.out.println("Not a dominent Number");
		} */
		
		
	
	
	
/*   	String s="hsenag ikkase";
		char [] a=s.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		} */
		 /*System.out.print("Enter first string: ");
       String s1=s.next();
       System.out.print("Enter second String: ");
        String s2=s.next();
       char[] str1=s1.toCharArray();
     //  Arrays.sort(str1);
       char[] str2=s2.toCharArray();
     //  Arrays.sort(str2);
       int count=0;
       for(int i=0;i<str1.length;i++)
       {
    	   for(int j=0;j<str2.length;j++)//abcddecb  bcedacbd
    	   {
    		   if(str2[j]==str1[i])
    			   count++;
    			   
    		   
    	   }
    	 
       }
       if(count>=str2.length)
       {
    	   System.out.print("yes");
       }
       else
       {
    	   System.out.print("no");
       }*/
     
    /*   int[] a= {2,0,11,15};
       int sum=9;
       for(int i=0;i<a.length;i++)
       {
    	for(int j=i+1;j<a.length;j++)
    	{
    	   if(sum ==(a[i]+a[j]))
    	   {
    		System.out.println(i);
    		System.out.println(j);
    	//	System.out.println(s1[i])
    		break;
    		
    	}
    	
       }
       }*/
      
	}
}




