package esakkiganesh;

public class NumOfNonRepChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="esakki ganesh";
        char[] arr=str.toCharArray();
        int[] freq=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]==' ')
        	{
        		freq[i]=-2;
        	}
        	else {
        	int count=1;
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]==arr[j])
        		{
        		   count++;
        		   freq[j]=-1;
        		}
        	}
        	if(freq[i]!=-1)
        		{
        			freq[i]=count;
        		}
        		
       }
     }
        int validno=0;
        for(int i=0;i<freq.length;i++)
        {
        	if(freq[i]!=-1&&freq[i]!=-2)
        	{
        		validno++;
        	}
        	System.out.print("("+freq[i]+arr[i]+"),");
        }
        System.out.println();
        System.out.print(validno);
	}
	

}
