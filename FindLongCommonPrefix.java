package esakkiganesh;

public class FindLongCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = { "java1" , "java2" , "java3" , "java4" };
		int [] len = new int[s.length];
		
		for( int i = 0; i < s.length; i++)
		{
			len[i] = s[i].length();
		}
		int min = Integer.MAX_VALUE;
		for ( int i = 0; i < len.length; i++)
		{
			if( len[i] < min)
			{
				min = len[i];
			}
		}
		System.out.println(min);
		for( int i = 0; i < min; i++)
		{
		   if( s[0].charAt(i) == s[s.length-1].charAt(i)) {
			   System.out.print(s[0].charAt(i));
		   }
		}

	}

}
