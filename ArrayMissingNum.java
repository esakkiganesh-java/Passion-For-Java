package esakkiganesh;

public class ArrayMissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = { 1, 2, 3, 4, 5, 6, 7, 9 , 10};
		int num = 1;
		for(int i = 0; i < a.length ; i++)
		{
			
			if(num != a[i])
			{
				System.out.print(num);
				break;
				
			}
			
			num ++;
		}
			

	}

}
