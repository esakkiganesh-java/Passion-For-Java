package esakkiganesh;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java World 1,2,red,blue orange-pink,3 four,five";
	    for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' '||s.charAt(i)==','||s.charAt(i)=='-')
			{
			 System.out.print("\n");	
			}
			if(s.charAt(i)!=(',')||s.charAt(i)!=' '||s.charAt(i)!='-')
			{
				if(s.charAt(i)!=',')
				{
					if(s.charAt(i)!=' ') {
						if(s.charAt(i)!='-') {
				System.out.print(s.charAt(i));}
					}
				}
			}
		}   
	
	}

}
