package esakkiganesh;

public class RotateEleArray {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8};
		int d=3;
		int j=0;
		while(j<d)
		{
			int last=a[0];
			for(int i=0;i<a.length-1;i++)
			{
			   a[i]=a[i+1];
			}
			a[a.length-1]=last;
			j++;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	    }
	

	}


