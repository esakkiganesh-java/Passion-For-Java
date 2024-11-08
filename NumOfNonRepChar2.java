package esakkiganesh;

public class NumOfNonRepChar2 {
	public static void main(String[] args) {
		String name="i love you";
		char[] a=name.toCharArray();
		int [] freq=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==' ')
			{
				freq[i]=-2;
			}
			else {
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
		}
		for(int i=0;i<a.length;i++)
		{
			//if(freq[i]>0)
			{
				//System.out.println(a[i] + "  occurs " + freq[i] + " times ");
			}
			System.out.print(freq[i]+" ");
			
		}
	}
}
		