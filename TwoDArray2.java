package esakkiganesh;
import java.util.*;
public class TwoDArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no of rows and colums");
	int r=sc.nextInt();
	int c=sc.nextInt();
     int [][] a=new int[r][c];
     System.out.println("enter the value of rows; and colums");
     for(int i=0;i<a.length;i++)
     {
    	 for(int j=0;j<a[0].length;j++)
    	 {
    		 a[i][j]=sc.nextInt();
    	 }
     }
     System.out.println("Array:");
     for(int i=0;i<a.length;i++)
     {
    	 for(int j=0;j<a[0].length;j++)
    	 {
    		 System.out.print(a[i][j]+" ");
    	 }
    	 System.out.println();
     }
	}

}

