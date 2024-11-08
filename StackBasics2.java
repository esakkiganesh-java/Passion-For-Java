package esakkiganesh;

import java.util.ArrayList;
import java.util.List;

public class StackBasics2<T> {
     
	List<T> stackList=new ArrayList<T>();
	int siize=0;
	public void put(T t) {
		stackList.add(t);
	}
	public T pop() {
		return(stackList.removeFirst());
	}
	public T peek()
	{
		return(stackList.getFirst());
	}
	public boolean isEmpty()
	{
		return(stackList.isEmpty());
	}
	public  void main(String[] args) {
		stackList.add(0, null);
		System.out.print(stackList);
		System.out.print(isEmpty());
	}
	 
	

}
