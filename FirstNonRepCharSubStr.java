package esakkiganesh;

public class FirstNonRepCharSubStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "abcdedcs" ;
        char[] ch = new char[s.length()];
        Outerloop:
        for(int i = 0; i < s.length(); i++)
        {
        	int count = 0;
        	if(i == 0)
        	{
        		ch[i] = s.charAt(i);
        	}
        	else {
        		for(int j = i; j > 0; j--)
        		{
        			if(s.charAt(i) == ch[j-1])
        			{
        				break Outerloop;
        			}
        			else {
        				count ++;
        			}
        		}
        		if(count == i)
        		{
        			ch[i] = s.charAt(i);
        		}
        	}
        }
     for(int i = 0; i < ch.length; i++)
     {
    	 if(ch[i] != ' ') {
    	 System.out.print(ch[i]+" "); }
     }
	}

}
