package esakkiganesh;

import java.util.Arrays;

//import java.util.Arrays;

public class ArrayList<T> {
	
	private Object[] elements;
	   int size;
	   
	   public ArrayList() {
		   
		  elements = new Object[10];
		  int size = 0;
	   }
	   public void add(T t) {
		   if(size == elements.length)
		   {
			   increaseCapacity();
		   }
		   elements[(size++)] = t;
	   }
	   public void increaseCapacity() {
		   int newCapacity = size *2 ;
		   elements = Arrays.copyOf(elements, newCapacity);
	   }
	   public void printList() {
		   for ( int i = 0; i < size; i++)
		   {
			   System.out.print(elements[i]+" ");
		   }
	   }
	   public void addAtPosition(int index, T t) {
		   if( index < 0 || index > size) {
			   throw new IndexOutOfBoundsException("Invalid index position: "+index);
		   }
		   if(index == size) {
			   add(t);
			   return;
		   }
		   if(index == 0)
		   {
			   int j = size++;
			   while( j > index)
			     {
			    	 elements[j] =  elements[j-1];
			    	 j--;
			     }
			   elements[j] = t;
			   return;
		   }
		  for( int i = 0; i < size; i++)
		  {
			  if( i == index)
			  {
				 Object temp = elements[i];
			     int j = size++;
			     while( j >= index)
			     {
			    	 elements[j] =  elements[j-1];
			    	 j--;
			     }
			     elements[index] = t;
			     elements[index+1] = temp;
			  }
			  
		  }
		 
	   }
	   public T get(int index) {
		   if( index < 0 || index >= size) {
			   throw new IndexOutOfBoundsException(" invalid index : "+index);
		   }
		   for( int i = 0; i <= index; i++)
		   {
			   if( i == index) {
				   return (T) elements[index];
			   }
		   }
		return null;
	   }
	   public boolean contains(T t) {
		   for( int i = 0; i < size; i++ )
		   {
			   if( elements[i] == t) {
				   return true;
			   }
		   }
		   return false;
	   }
	   public int SizeOfEle(T t) {
		   int count = 0;
		   for( int i = 0; i < size; i++)
		   {
			   if(elements[i] == t)
			   {
				   count++;
			   }
		   }
		   return count;
	   }
	   public void Reverse() {
		   for( int i = size-1; i >= 0; i--)
		   {
			   System.out.print(elements[i]+" ");
		   }
		   System.out.println();
	   }
	   public int FirstIndex(T t) {
		   for(int i = 0; i < size; i++)
		   {
			   if(elements[i] == t)
			   {
				   return i;
			   }
		   }
		   return -1;
	   }
	   public int LastIndexOf(T t) {
		   for(int i = size -1 ; i >= 0; i--)
		   {
			   if(elements[i] == t)
			   {
				   return i;
			   }
		   }
		   return -1;
	   }
	/*   public void Remove(int index) {
		   if( index < 0 || index >= size) {
			   throw new IndexOutOfBoundsException("invalid position "+index);
		   }
		   for( int i = 0; i < size; i++)
		   {
			   if( i == index) {
				   T j ;
				   while(i < size) {
					   j =  (T) elements[i];
					   elements[i] = elements[i+1];
				     }
			   }
		   }
	   } */
	   public void set(int index,T t) {
		   for( int i = 0; i <= index; i++)
		   {
			   if( i == index)
			   {
				   T temp = (T) elements[i] ;
				   elements[i] = t;
			   }
		   }
	   }
	   public boolean isEmpty() {
		   if(size == 0) {
			   return true;
		   }
		return false;
	   }
	   public void subList(int fromindex,int toindex) {
		   if( fromindex >= toindex)
		   {
			   throw new IndexOutOfBoundsException("invalid index position "+fromindex+" to "+toindex);
		   }
		  Object[] sublist = new Object[toindex - fromindex];
		  int j = 0;
		  for( int i = fromindex; i < toindex; i++)
		  {
			  sublist[j] = elements[i];
			  System.out.print(sublist[j]+" ");
			  j++;
		  }
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		list.addAtPosition(3,3);
		//list.addAtPosition(2, 8);
		//list.addAtPosition(0, -11);
		//list.addAtPosition(0, null);
		//System.out.println(list.size);
		//list.add(5);
		//list.add(2);
		//list.add(3);
		//list.addAtPosition(12, null);
		//list.printList();
		//System.out.println();
		//System.out.println(list.get(0));
		//System.out.println(list.get(5));
		//list.addAtPosition(13,05);
		list.add(0);
		//list.add(5);
		list.set(6,6);
		//list.printList();
		//System.out.println();
		//System.out.println(list.get(13));
		//System.out.println(list.contains(5));
		//System.out.println(list.SizeOfEle(3));
		//list.Reverse();
		System.out.println(list.size);
		//System .out.println(list.FirstIndex(0);
		//list.set(0, 3);
		//list.set(6, 3);
		list.printList();
		System.out.println();
		//System.out.println(list.LastIndexOf(3));
		//list.Remove(7);
		//System.out.println(list.isEmpty());
		list.subList(2,5);

	}

}
