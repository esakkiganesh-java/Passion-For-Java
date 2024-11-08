package esakkiganesh;

public class NoOfDeletions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "AAABBB";
        int count = 0;
        for( int i = 0; i < s.length() -1; i++)
        {
        	if(s.charAt(i) == 'A')
        	{
        		if(s.charAt(i+1) == 'B')
        		{
        			i++;
        		}
        		else
        			count++;
        	}
        	else if(s.charAt(i) == 'B')
        	{
        		if(s.charAt(i+1) == 'A')
        		{
        			i++;
        		}
        		else {
        			count++;
        		}
        	}
        }
        System.out.print("deletions : "+count);
	}

}
