package esakkiganesh;

import java.util.Arrays;

public class ThreeCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int[] a= {3,7,1,2,8,4,5};
			int sum=10;
			//Arrays.sort(a);
			for(int i=0;i<a.length;i++)
			{
				for(int j=i;j<a.length;j++) {
					for(int k=j;k<a.length;k++) {
						if((a[i]+a[j]+a[k])==sum)
						{
						 if(a[i]!=a[j]&&a[i]!=a[k]&&a[j]!=a[k]) {
								
							System.out.println(a[i]+" " +a[j]+" "+a[k]);
						     
					     }
						 
					   }
				   }
		        }
	       }

	}

}
