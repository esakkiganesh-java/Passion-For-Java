package esakkiganesh;

import java.util.ArrayList;
import java.util.List;

public class SnakeFestival {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "HT";
		int n = s.length();
		int count = 0;
		System.out.println(n);
		List<Character> list = new ArrayList<>();
		for( int i = 0 ; i < n ; i++)
		{
			if(s.charAt(i)=='H'||s.charAt(i)=='T')
			{
				list.add(s.charAt(i));
			}
		}
		System.out.println(list);
		if((list.size()%2)!=0)
		{
			System.out.println("Invalid");
		}
		else if(list.getFirst() == 'T') {
			System.out.println("Invalid");
		}
		else {
		     for( int i = 0; i < list.size();i++)
		     {
			   if(list.get(i)== 'H'&& list.get(i+1)=='T')
			   {
				      count++;
				      i++;
			   }
			   else {
				   System.out.println("Invalid");
				   break;
			   }
		     }
	 if( count == list.size()/2)
		{
		   System.out.println("Valid");
		}
	}
 }

}
