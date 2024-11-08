package esakkiganesh;

public class StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		int result=ispalindrom(s);
		if(result==-1)
		{
			System.out.print("Not Palindrom: "+s);
		}
		else
		{
			System.out.print("Palindrom: "+s);
		}
		}

	private static int  ispalindrom(String s) {
		// TODO Auto-generated method stub
		for(int i=0,j=s.length()-1;i<=j;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return -1;
			}
		}
		return 1;

		
	}

}
