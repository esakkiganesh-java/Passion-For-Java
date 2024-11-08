package esakkiganesh;
import java.util.Stack;

public class StackBaics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> a=new Stack<>();
		int [] b= {1,2,3,4,5};
 		Stack<Integer> c=new Stack<>();
		a.push(10);
		a.push(20);
		a.push(30);
		a.push(40);
		a.push(50);
		System.out.println(a);
		System.out.println(a.pop());
		System.out.println(a);
		System.out.println(a.peek());
		System.out.println(a);
		System.out.println(a.pop());
		for(int i=0;i<a.size();i++)
		{
			if(a.get(i)==20)
			{
				System.out.println(a.get(i));
				System.out.println(i);
			}
		}
		System.out.println(a);
		for(int i=0;i<b.length;i++)
		{
			c.push(b[i]);
		}
		System.out.print(c);
		

	}

}
