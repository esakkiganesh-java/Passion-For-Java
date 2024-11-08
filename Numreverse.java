package esakkiganesh;

public class Numreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = -321;
		int ans = 0;
		while( 0 > num || 0 < num)
		{
			int rem = num % 10;
			ans = ans*10 + rem;
			num = num/10;
		}
		System.out.print(ans);

	}

}
