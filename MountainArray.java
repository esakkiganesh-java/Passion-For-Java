package esakkiganesh;

public class MountainArray {
	public static boolean isMountainArray(int[] a){
		int n=a.length;
		if(n<3)
		{
			return false;
		}
		int i=0;
		while(i+1<n&&a[i]<a[i+1])
		{
			i++;
		}
		if(i==0||i==n-1)
		{
			return false;
		}
		while(i+1<n&&a[i]>a[i+1])
		{
			i++;
		}
		return i==n-1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {0,3,2,1};
		System.out.println(isMountainArray(a));
		int[] b= {0,2,3,3,5,2,1};
		System.out.println(isMountainArray(b));

	}

}
