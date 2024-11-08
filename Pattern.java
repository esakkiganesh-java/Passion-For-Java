package esakkiganesh;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int value = 1;
		int ans = value;
		for(int i = 0; i < n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == 0 && j == 1)
				{
					System.out.print(ans + " ");
				}
				else {
				ans = ans + j ;
				System.out.print(ans +" ");
				}
			}
			value = value + i ;
			ans = value;
			System.out.println();
		}
	}
}
