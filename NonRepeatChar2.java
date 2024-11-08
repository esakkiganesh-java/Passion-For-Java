package esakkiganesh;

public class NonRepeatChar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name="aacg";
		String name="esakki ganesh";
		char[] a=name.toCharArray();
		int [] freq=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			int no=a[i];
			int count=1;
			if( no!=' ') {//This condition for avoiding space char in the string
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
			if(freq[i]==1)
			{
				System.out.print(a[i]+" ");
			}
		}  
}
}


