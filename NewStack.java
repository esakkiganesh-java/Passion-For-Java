package esakkiganesh;

import java.util.ArrayList;
import java.util.List;

public class NewStack<T> {
	List<T> stackList = new ArrayList<T>();
	int size = 0;
	
	public void put(T t) {
		stackList.add(t);
	}
	
	public T pop() {
		return stackList.remove(stackList.size()-1);
	}
	
	public T top() {
		return stackList.get(stackList.size()-1);
	}
	
	
	public int size() {
		return stackList.size();
		
	}
	public void push(T t) {
		stackList.add(t);
		
	}
	public void printStack() {
		for( int i = 0; i < stackList.size(); i++)
		{
			System.out.print(stackList.get(i)+" ");
		}
	}
	public void Reverse() {
		for( int i = stackList.size()-1; i >= 0; i-- )
		{
			System.out.print(stackList.get(i)+" ");
		}
	}
	public int sizeofChar(T t) {
		int count = 0;
		for( int i = 0; i < stackList.size(); i++)
		{
			if(stackList.get(i)== t) {
				count++;
			}
		}
	 return count;
	}
	public int FirstIndex(T t) {
		for( int i = 0; i < stackList.size(); i++) {
			if(stackList.get(i) == t)
			{
				return i;
			}
		}
	return -1;
	}
	public int LastIndex(T t) {
		for( int  i = stackList.size() -1; i >=0; i--) {
			if(stackList.get(i) == t)
			{
				return i;
			}
		}
	return -1;
	}
	public T Get(int pos) {
		for ( int i = 0; i < stackList.size(); i++) {
			if( i == pos) {
				return stackList.get(i);
			}
		}
		return null;
	}
	public boolean Palindrom() {
		for( int i = 0; i < stackList.size()/2; i++) {
			int j = (stackList.size()- i - 1);
				if((!stackList.get(i).equals(stackList.get(j)))) {
					return false;
				}
		    }
		return true;
	}
	public boolean contains(T t) {
		for( int i = 0; i < stackList.size(); i++)
		{
			if( stackList.get(i)== t)
			{
				return true;
			}
		}
		return false;
	}
	public void set( int pos , T t) {
		for ( int i = 0; i < stackList.size(); i++)
		{
			if( i == pos) {
	           stackList.set(i, t);
			}
		}
	}
	
	public static void main(String[] args)
	{
		NewStack<Character> stack = new NewStack<>();
		String s = "abcddcba";
		for( int i = 0; i < s.length(); i++)
		{
			stack.push(s.charAt(i));
		}
		System.out.println(stack.top());
	    stack.printStack();
	    System.out.println();
/*1*/	    stack.Reverse();
/*2*/	    System.out.println(stack.size());
/*3*/	    System.out.println(stack.sizeofChar('a'));
/*4*/       System.out.println(stack.FirstIndex('z'));
/*5*/       System.out.println(stack.LastIndex('c'));
/*6*/       System.out.println(stack.Get(1));
/*7*/       System.out.println(stack.Palindrom());
/*8*/       System.out.println(stack.contains('s'));
/*9*/       stack.set(1,'z');
            stack.printStack();
   }

}