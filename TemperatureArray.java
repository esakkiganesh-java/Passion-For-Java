package esakkiganesh;

public class TemperatureArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] temp = {73, 74, 75, 71, 69, 72, 76, 73 };
		//int [] temp = { 30, 40, 50, 60} ;
		int [] days = new int[temp.length];
		for( int i = 0 ; i < temp.length-1; i++)
		{
			int count = 1;
			for( int j = i+1; j < temp.length; j++)
			{
				if(temp[j] > temp[i])
				{
					days[i] = count;
					break;
				}
				else {
					count++;
				}
			}
		}
		for( int i = 0; i < days.length; i++)
		{
			System.out.print(days[i]+" ");
	    }
    }
  }
