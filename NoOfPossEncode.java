package esakkiganesh;

public class NoOfPossEncode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] val = { 1, 2, 3, 4, 5};
		int result = 1;
		for( int i = 0; i < val.length -1 ; i++)
		{
			if( val[i]<= 2 && val[i+1] <= 6 )
			{
				result++;
			}
		}
       System.out.print(result);
	}

}
