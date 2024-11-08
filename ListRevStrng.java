package esakkiganesh;

import java.util.LinkedList;
import java.util.List;

public class ListRevStrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s = "ab cd" ;
		List<Character> list = new LinkedList<>();
		for( Character ch : s.toCharArray())
		{
			list.add(ch);
		}
		System.out.println(list);
		
		for(int i = list.size()-1; i >= 0 ; i--)
		{
			System.out.print(list.get(i)+" ");
		}
		StringBuilder  str = new StringBuilder();
		for( int i = list.size()-1; i >= 0; i--)
		{
			str.append(list.get(i));
		}
		System.out.println();
		System.out.println("Original String: "+s);
		System.out.print("Reversed String: "+str);
	}

}
