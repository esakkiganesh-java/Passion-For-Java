package esakkiganesh;

import java.util.LinkedList;

public class KungFuPandaTraining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[]  a = { 3, 3, 4, 5, 4};
		int n = a.length;
		LinkedList<Integer> list = new LinkedList<>();
		for(int i = 0; i < n; i++)
		{
			list.add(a[i]);
		}
		System.out.println(list);
		int ans = 0;
		for(int i = 0; i < n  ; i++)
		{
			int temp = list.getFirst();
			ans = ans + list.getFirst();
			System.out.println("ans = "+ans+" , getfirst = "+list.getFirst());
			for( int j = i; j < n ; j++) {
			  int temp1 = list.get(j);
			  if( temp1 == temp + 1 || temp1 == temp - 1){
				list.remove(j);
				System.out.println(list);
				n--;
			  }
			}
		  list.remove();
		  n--;
		  System.out.println(list);
		  if(list.size() == 1) {
			  ans = ans + list.getFirst();
		  }
		}
     System.out.println(ans);
   }
}

 
