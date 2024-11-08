package esakkiganesh;

public class FreqArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {2,3,4,5,6,7,8,9,1,2,3,4,54,32,1,};
		int [] freq=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			int no=a[i];
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(no==a[j])
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
		for(int i=0;i<a.length;i++)
		{
			if(freq[i]>0)
			{
				System.out.println(a[i] + "  occurs " + freq[i] + " times ");
	
			}
		}
		int position=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]>max)
			{
				max=freq[i];
				position=i;
				
			}
		}
		System.out.println(max+ " comes at "+position+" position ");
        System.out.print(a[position]);
	}
}

