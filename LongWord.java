package esakkiganesh;

public class LongWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String s="I am Good Boy ";
		char c='0';
		int count=0;
		for(int i=0;i<s.length();i++)
		{
		   if(s.charAt(i)!=' ')
		   {
			 System.out.print(s.charAt(i));
		   }
		   else
		   {
			  System.out.println();	
		   }

	} */
		String s1="Trust me im a MECHANICAL ENGINEER ";
		String[] words=s1.split(" ");
		for(int i=0;i<words.length;i++)
		{
		//	System.out.println(words[i]+" "+words[i].length()+" length");
		}
		int maxlen=0;
		String str = null;
		for(int i=0;i<words.length;i++)
		{
		  if(words[i].length()>maxlen)
		  {
			maxlen=words[i].length();
			str=words[i];  
		  }
		}
		System.out.print(str);
	}
}


