package esakkiganesh;

public class StackPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "madam";
		Stack<Character> stack = new Stack<>();
		for( int i = 0; i < str.length(); i++)
		{
			stack.put(str.charAt(i));
		}
		boolean palindrom = true;
		for( int i = 0; i < str.length(); i++) {
			if(stack.pop()!= str.charAt(i)) {
				palindrom = false;
				break;
			}
		}
     System.out.println(palindrom);
	}

}
