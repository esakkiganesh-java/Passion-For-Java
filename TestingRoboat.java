package esakkiganesh;

public class TestingRoboat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n , key;
		String s = "RRLLLL";
		n = s.length();
		key = 10;
		System.out.print(key);
		for( int i = 0; i < n ; i++)
		{
				if(s.charAt(i) == 'R')
				{
					key = key+1;
					System.out.print("-->"+key);
				}
				if(s.charAt(i) == 'L')
				{
					key = key - 1;
					System.out.print("-->"+key);
				}
			
		}
				

	}

}
