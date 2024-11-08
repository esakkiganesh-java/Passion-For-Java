package esakkiganesh;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
	
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

	
	
	
	public static void main(String[] args) {
		
		String input = "MADSGSDAM";
		boolean flag = true;
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i< input.length()-1;i++) {
			if(i<input.length()-1/2) {
				stack.put(input.charAt(i));
			}else {
				if(input.charAt(i) != stack.pop()) {
					flag = false;
				}
			}
		}
		
		
		System.out.println(flag); 
		Stack<Integer> stacklist = new Stack<Integer>();
		stacklist.put(5);
		stacklist.put(4);
		stacklist.put(3);
		stacklist.put(2);
		stacklist.put(1);
		System.out.println(stacklist.pop());
		System.out.println(stacklist.size());
		System.out.println(stacklist.top());
	
		
	}


}
