package esakkiganesh;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,20,30,60,50,50,50};
		int key=40+10;
		int count=0;
		int position = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				count++;
				position=i;
				break;
				
			}
			
		}
		if(count>0)
		{
			System.out.println(key+" is presnt in  "+position+" position");
		}
		else {
			System.out.print(key+" not present ");
		}
		}
	}


