package esakkiganesh;

public class StringVowelsCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "government collge of engineering tirunelveli";
        int vowelscount = 0;
        int ConstantsCount = 0;
        for(int i = 0; i < s.length(); i++)
        {
        	if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
        	{
        		vowelscount++;
        	}
        	else
        	{
        		if(s.charAt(i)!=' ')
        		{
        			ConstantsCount++;
        		}
        	}
        }
        System.out.println("String: "+s);
        System.out.println("Length: "+s.length());
        System.out.println("VowelsCount: "+vowelscount);
        System.out.println("ContantsCount: "+ConstantsCount);
        System.out.println("Spaces: "+(s.length()-(ConstantsCount + vowelscount)));
	}

}
