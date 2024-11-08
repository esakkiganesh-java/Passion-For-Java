package esakkiganesh;

public class MarioJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,5,8,9,2,6,7,6,8,9,1,3,4,6};
		//int [] a  = { 1, 5, 6, 7, 2, 1, 0, 1};
		//int [] a = { 7, 8, 2, 1, 5, 2, 6, 1, 0};
		// int [] a = { 5, 2, 3};
		int jump = 1;
		for( int i = a[0] ; i < a.length; i++)
		{
			if(a[i] == 0) {
				jump = 0;
				System.out.println("Initial position is Zero");
				break;
			}
			jump ++;
			i = i + a[i];
			if(i >= a.length-1)
			{
				break;
			}
			if(a[i] == 0) {
				jump = -1;
				break;
			}
			
		}
		System.out.print(jump+" jumps need to reach the destination");

	}

}
