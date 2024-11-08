package esakkiganesh;

public class NoOfDeletions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "BABABAB";
		int count = 0;
		for( int i = 0;i < s.length()-1; i++ )
		{
			if( s.charAt(i) == 'A')
			{
				if( s.charAt(i+1) == 'B')
				{
					count = count+2;
					i++;
				}
			}
			else if( s.charAt(i) == 'B')
			{
				if( s.charAt(i+1) == 'A')
				{
					count = count+2;
					i++;
				}
		    }    
	    }
		if(count == 0) {
			System.out.print("deletions : "+(s.length()-1));
		}
		else {
		System.out.print("deletions : "+(s.length()-count));
		}
	}

}
