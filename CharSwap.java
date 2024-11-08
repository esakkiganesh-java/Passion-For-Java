package esakkiganesh;

public class CharSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ganesh Esakki";
		char[] a=s.toCharArray();
		int d=7;
		int i=0;
		while(i<d)
		{
		   char last=a[0];
		   for(int j=0;j<s.length()-1;j++)
		   {
			  a[j]=a[j+1]; 
		   }
		   a[a.length-1]=last;
		   i++;
			
		}
		
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]);
		}
				

	}

}
