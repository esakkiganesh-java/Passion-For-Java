package esakkiganesh;

public class LinkedListStringUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Character> list = new LinkedList<>();
		String s = "abcdefghi" ;
		for(int i = 0; i < s.length(); i++)
		{
			list.add(s.charAt(i));
		}
		System.out.print("My_String_is : ");
		list.printList();
		System.out.println();
		System.out.print("Reversed_String :");
		for(int i = list.size() - 1; i >= 0; i--)
		{
	
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println(list.SizeOf('a'));
		System.out.println(list.indexOf('e'));
		System.out.println(list.contains('s'));
		System.out.println(list.set('f','g'));
		list.display();
		System.out.println();
		list.substring(1, 4);
		System.out.println();
		System.out.print(" mid :" + list.mid());

	}

}
