package esakkiganesh;

public class TRCExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "abchpcgho";
		String s2="abcefcgpo";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				System.out.print(s1.charAt(i));
			}
		}
		for(int i=0;i<s2.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				System.out.print(s2.charAt(i));
			}
			
		}

	}

}
