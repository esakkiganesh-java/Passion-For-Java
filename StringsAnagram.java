package esakkiganesh;

import java.util.Arrays;

public class StringsAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="new";
		String s2="ewn";
		char[] a=s1.toCharArray();
		char[] b=s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		int count=0;
		if(a.length!=b.length)
		{
			System.out.print("Strings Not Anagram");
		}
		else {
		    for(int i=0;i<a.length;i++)
		    {
			    if(a[i]!=b[i])
			    {
				  System.out.print("Strings not Anagram");
				  break;
			    }
			    else {
			    	count++;
			    }
		   }
	    }
		if(count==a.length)
		{
			System.out.print("Strings are Anagram");
		}
	}
}
