package esakkiganesh;
import java.util.*;
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 	 Scanner sc=new Scanner(System.in);
     int r=sc.nextInt();
     int c=sc.nextInt();
     int [][] a=new int[r][c];
     System.out.println("enter the value for no of rows and colums:");
     for( int i=0;i<a.length;i++)
     {
    	 for(int j=0;j<a[0].length;j++)
    	 {
    		 a[i][j]=sc.nextInt();
    	 }
     }
     for( int i=0;i<a.length;i++)
     {
    	 for(int j=0;j<a[0].length;j++)
    	 {
    		 System.out.print(a[r][c]+" ");
    	 }
    	 System.out.println();
     }
	/*	int [] a= {1,2,3,45,6,7,8,9,0};
		int x=4;
		int y=10;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>x&&a[i]<y) {
				System.out.println(a[i]);
				
			}
		}  */
	}

}
