package esakkiganesh;

public class StrRepChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="warld";
		char[] a=s.toCharArray();
		int index=1;
		char ch='o';
		for(int i=0;i<a.length;i++)
		{
			if(i==index)
			{
				a[i]=ch;
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
