package esakkiganesh;

public class SquareRootOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=36;
		for(int i=0;i<50;i++)
		{
			if((i*i)==num)
			{
				System.out.print(i);
				break;
			}
			if((i*i)>num)
			{
				System.out.print(i-1);
				break;
			}
		}

	}

}
