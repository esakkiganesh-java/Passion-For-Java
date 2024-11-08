package esakkiganesh;

import java.util.ArrayList;
import java.util.List;

public class ListBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al = new ArrayList();
		al.add(10);
		al.add('g');
		al.add("Ganesh");
		al.add(true);
		al.add(10.5);
		al.add(24542667);
		System.out.println(al);
		
		List<Object> obj = new ArrayList<Object>();
		obj.add(10);
		obj.add('g');
		obj.add("Ganesh");
		obj.add(true);
		obj.add(10.5);
		obj.add(24542667);
		System.out.println(obj);
		for(int i = obj.size()-1; i>=0; i--)
		{
			System.out.print(obj.get(i)+ " ");
		}
	}

}
