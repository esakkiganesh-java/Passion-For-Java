package esakkiganesh;

public class LinkedList <T> {
	
	Node head;
	
	class Node<T>{
		
		T data; //node data 
		Node<T> next;//node next data
		Node(T t){
    		data = t;
			next = null;
		}
	}
	LinkedList(){
		head = null;// once object to be created constructor set the head is null;
	}
	public void insertAtBeginning(T t)
	{
		Node newNode = new Node(t);
		//when list is empty
		if(head == null)
		{
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
	}
		public void display() {
			Node temp = head;
			while(temp != null)
			{
				System.out.print(temp.data +" ");
				temp = temp.next;
			}
		}
		public void insertAtPosition(int pos, T t) {
			if(pos == 0)
			{
				insertAtBeginning(t);
				return;
			}
			Node newNode = new Node(t);
			Node temp = head;
			for(int i = 1; i < pos; i++)
			{
				temp = temp.next;
				if( temp == null)
				{
					throw new IndexOutOfBoundsException("Invalid position "+pos);
				}
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
		public void deleteAtPosition(int pos)
		{
			if(pos == 0)
			{
				deleteAtBeginning();
			}
		
			if( head == null) {
				throw new IndexOutOfBoundsException("Deletion attempted on empty list:");
			}
			Node temp = head;
			Node prev = head;
			for( int i = 1 ; i <= pos; i++)
			{
				prev = temp;
				temp = temp.next;
			}
			prev.next = temp.next;
		}
	
	

	public void deleteAtBeginning() {
			// TODO Auto-generated method stub
		if( head == null)
		{
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");
		}
		head = head.next;
			
		}
	public  T get(int pos) {
		if(pos < 0)
		{
			throw new IndexOutOfBoundsException("Get attempt on empty list");
		}
	    if(pos == 0)
		{
	    	if( head == null) {
	    		throw new IndexOutOfBoundsException("It is a Empty List");
	    	}
			return (T) head.data;
		}
		Node temp = head;
			for( int i = 1; i < pos; i++)
			{
			    if( temp == null) {
			    	throw new IndexOutOfBoundsException("position is greater than the list size");
			    }
			    temp = temp.next;
			}
		return (T) temp.next.data;	
		
	}
	public T getFirst() {
		if( head == null) {
			throw new IndexOutOfBoundsException("get Attempt on empty list");
		}
		return  (T) head.data;	
	}
	public int size() {
		int size = 0;
		Node temp = head;
		if( temp == null)
		{
			return 0;
		}
		while(temp != null)
		{
		   
		   temp = temp.next;
		   size++;
		}
	 return size;	
		
	}
	public T getLast() {
		if( head == null)
			{
				throw new NullPointerException("getLast attempt on empty list");
			}
		Node temp = head;
		while( temp.next != null )
		{
			temp = temp.next;
		}
		
	 return (T) temp.data;
	}
	public void insertAtLast(T t) {
		Node temp = head;
		if(head == null)
			{
			insertAtBeginning(t);
			return;
			}
		while( temp.next != null)
		{
			temp = temp.next;
		}
		Node newNode = new Node(t);
		newNode.next = temp.next;
		temp.next = newNode;	
	}
	public void deleteAtLast() {
		Node temp = head;
		if( head == null) {
			throw new IndexOutOfBoundsException("deleteAtLast attempt om empty list");
		}
		if ( temp.next == null) {
			head = temp.next;
		}
	    for( int i = 0; i < size(); i++)
	    {
	    	if( i == size()- 2)
	    	{
	    		temp.next = null;
	    		return;
	    	}
	    	temp = temp.next;
	    }
	}
	public boolean contains(T t) {
		Node temp = head;
		if( head == null) {
			throw new IndexOutOfBoundsException("Contains attempt on empty list");
		}
		while( temp != null) {
			if ( temp.data == t) {
				return true;
			}
			temp = temp.next;	
		}
		return false;
	}
	public int indexOf(T t) {
		Node temp = head;
		for( int i = 0; i < size(); i++)
		{
			if (temp.data == t)
			{
				return i;
			}
			temp = temp.next;
		}
		return -1;
	}
	public boolean isEmpty() {
		if( head == null) {
			return true;
		}
		return false;
	}
	public void deleteall() {
		head = null;
	}
	public void add(T t) {
		insertAtLast(t);
	}
	public void delete() {
		Node temp = head;
		if( head == null) {
			throw new IndexOutOfBoundsException("delete attempt on empty list");
		}
		head = temp.next;
	}
	public void printList() {
		Node temp = head;
		if(head == null) {
			throw new IndexOutOfBoundsException("List is empty");
		}
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public int SizeOf(T t) {
		Node temp = head;
		int count = 0;
		if( head == null) {
			throw new IndexOutOfBoundsException("List is Empty");
		}
		while( temp != null) {
			if( temp.data == t) {
			count++;
			}
			temp = temp.next;
		}
	 return count;
	}
	public boolean set(T t, T t1) {
		if(head == null) {
			throw new IndexOutOfBoundsException("It is a empty list");
		}
		Node temp = head;
	   while(temp != null) {
		  if(temp.data == t)
		  {
			  temp.data = t1;
			  return true;
		  }
		 temp =  temp.next;
	   }
	 return false;
	}
	public void substring(int fr,int to) {
		if(head == null) {
			throw new IndexOutOfBoundsException("It is a empty list");
		}
		int index = 0;
		Node temp = head;
		while( temp != null) {
			if( index >= fr && index < to) {
				System.out.print(temp.data+" ");
			}
			index++;
			temp = temp.next;
		}
	}
	public T mid() {
		//Node temp = head;
		Node temp1 = head;
		Node temp2 = head;
		if(head == null) {
			throw new IndexOutOfBoundsException("List is empty");
		}
		while(temp2.next.next != null) {
			temp1 = temp1.next;
			temp2 = temp2.next.next;
			if(temp2.next == null)
			{
				return (T) temp1.data;
			}
		}
		return (T) temp1.data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList<Integer> list = new LinkedList<Integer>();// create required num of objects
       list.insertAtBeginning(1);
       list.insertAtBeginning(2);
     //  list.display();
     //  System.out.println();
       list.insertAtPosition(1,3);
       list.insertAtPosition(3, 0);
       list.insertAtPosition(0, 4);
      // list.insertAtPosition(6, 0);
     //  list.display();
     //  System.out.println();
     //  list.deleteAtPosition(2);
      // list.deleteAtPosition(0);
     //  list.deleteAtBeginning();
     //  list.deleteAtPosition(0);
       list.display();
       System.out.println();
     //  list.get(0);
     //  list.display();
     //  System.out.println();
     //  list.getFirst();
     //  list.display();
      //  System.out.println(list.size());
      //  list.deleteAtBeginning();
        list.insertAtLast(5);
       // System.out.println(list.getFirst());
        list.deleteAtLast();
        list.add(8);
        list.display();
        System.out.println();
      //  System.out.println(list.getLast());
      //  System.out.println(list.get(3));
        System.out.println(list.contains(8));
        System.out.println(list.indexOf(0));
      //  list.deleteAtBeginning();
      //  list.deleteAtBeginning();
      // list.deleteall();
         list.delete();
        System.out.println(list.isEmpty());
        list.delete();
        list.display();
        System.out.println();
       //System.out.println(list.getFirst());
        //System.out.println();
        System.out.println(list.mid());
        
	}
 }
