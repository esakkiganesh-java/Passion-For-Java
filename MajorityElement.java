package esakkiganesh;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,4,2,4,2,4,4};
		System.out.println(a.length);
		int[] freq=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			int no=a[i];
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(no==a[j])
				{
					freq[j]=-1;
					count++;
				}
			}
			if(freq[i]!=-1)
			{
				freq[i]=count;
			}
		}
		for(int i=0;i<freq.length;i++)
		{
			System.out.print(freq[i]+" ");
		}
		int max=0;
		int s=0;
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]>max) 
			{
				max=freq[i];
			    s=i;
			}
		}
		System.out.println();
		System.out.println("s= "+s);
		System.out.println("max: "+max);
		if(max>(a.length/2))
		{
			System.out.print("majority element is "+a[s]+" occurs in "+s+" position");
		}
		else {
			System.out.print("No Majority element");
		}
		

	}

}
