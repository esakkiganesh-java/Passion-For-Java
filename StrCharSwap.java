package esakkiganesh;

public class StrCharSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Esakki Ganesh";
		char[] a=s.toCharArray();
		//char [] a= {'j','a','v','a'};
		char ch;
	    int i=0;
	    while(i<a.length-1)
	    {
	    	ch=a[i];
	    	a[i]=a[i+1];
	    	a[i+1]=ch;
	    	 i=i+2;
	    }
	    
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]);
		}

	}

}
