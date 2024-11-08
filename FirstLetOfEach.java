package esakkiganesh;

public class FirstLetOfEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am Good Boy";
		char[] a=s.toCharArray();
		char ch=' ';
		for(int i=0;i<a.length;i++)
		{
			if(i==0)
			{
				System.out.print(a[i]);
			}
			if(a[i]==ch)
			{
				System.out.print(a[i+1]);
			}
		}

	}

}
