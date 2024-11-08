package esakkiganesh;

public class StackUtils extends Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<>();
		String s = "abcde";
		for ( int i = 0 ; i < s.length(); i++)
		{
			stack.push(s.charAt(i));
		}
		System.out.println(stack);

	}

}
