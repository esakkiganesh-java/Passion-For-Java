package esakkiganesh;
import java.util.Stack;
public class RevStrStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ESAKKI GANESH";
		char[] a=s.toCharArray();
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<a.length;i++)
		{
			stack.add(a[i]);
		}
		System.out.println(stack);
		System.out.println(stack.size());
		int size=stack.size();
		for(int i=0;i<size;i++)
		{
			System.out.print(stack.pop());
		}
		

	}

}
