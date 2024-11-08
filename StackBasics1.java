package esakkiganesh;
import java.util.Stack;
public class StackBasics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="((A+B)+(C))";
		char[] b=s.toCharArray();
		char  ch1='(';
		char  ch2=')';
		int c1=0;
		int c2=0;
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			stack.push(b[i]);
			if(stack.get(i)==ch1)
			{
			    c1++;	
			}
			if(stack.get(i)==ch2)
			{
				c2++;
			}
		}
		System.out.println(stack);
		System.out.println(c1+" "+c2);
		if(c1==c2)
		{
			System.out.println("TRUE");
		}
		else {
			System.out.print("No");
		}
		
	}

}
