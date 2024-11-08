package esakkiganesh;

import java.util.ArrayList;
import java.util.List;

public class Stack2<T> {
	
	List<T> stack =  new ArrayList<T>();
	private int size = 0;
	public void put(T t) {
		stack.add(t);
	}
	public T pop() {
		size--;
		return  stack.remove(stack.size()-1);
	}
	public T top() {
		return stack.get(stack.size()-1);
		
	}
	public int size() {
		return stack.size();
	}
	public boolean isEmpty() {
		if(size == 0)
		{
			return true;
		}
		return false;
	}
	public boolean palindrom(String str) {
		for( int i = 0; i < str.length(); i++) {
			if(!(((Stack2<Character>) stack).pop()).equals(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack2<Character> stack = new Stack2<>();
		String  s = "abcde";
		String s2 = "abccba";
		for ( int i = 0; i < s2.length(); i++)
		{
			stack.put(s2.charAt(i));
			System.out.print(s2.charAt(i)+" ");
		}
		System.out.println();
		System.out.println(stack.size());
		//System.out.println(stack.palindrom(s2));
		
	}

}
