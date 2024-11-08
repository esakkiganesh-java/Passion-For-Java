package esakkiganesh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class ArrayListDemo {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> n=new ArrayList<Integer>();
		ArrayList<T> s=new ArrayList<T>();
		n.add(10);
		n.add(1, 20);
		n.addAll(n);
		System.out.println(n);
		n.addFirst(10);
		n.addLast(100);
		System.out.println(n);
		System.out.println(n);
		n.clone();
		System.out.println(n);
		 System.out.println(n.contains(20));
		System.out.println( n.containsAll(n));
		System.out.println(n.getFirst());
		System.out.println(n.getLast());
		System.out.println(n.indexOf(100));
		System.out.println(n.isEmpty());
		System.out.println(n.remove(1));
		System.out.println(n);
		System.out.println(n.size());
		System.out.println();
		n.clone();
		System.out.println(n);
		System.out.println(n);
		System.out.println(s);
		LinkedList<String> str=new LinkedList<String>();
		str.add("java");
		System.out.println(str);
		

	}

}
