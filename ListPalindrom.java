package esakkiganesh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] a = { 1, 2,  4, 4,  2, 1};
		List<Integer> list = new ArrayList<>(Arrays.asList(a));
		boolean ispalindrom = checkpalindrom(list);
		if(ispalindrom)
		{
			System.out.print("List is palindrom");
		}
		else
		{
			System.out.print("List is not palindrom");
		}
       
	}

	private static boolean checkpalindrom(List<Integer> list) {
		// TODO Auto-generated method stub
		int n = list.size();
		for( int i = 0; i < (n/2); i++)
		{
			if(! list.get(i).equals(list.get(n - i - 1)))
			{
				return false;
			}
		}
		
		return true;
	}

}
