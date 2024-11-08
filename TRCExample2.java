package esakkiganesh;

public class TRCExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,5,9,18,21};
		int len=a.length-1;
		 int key=14;
		 Object left;
		 Object right;
		 for(int i=0;i<a.length;i++)
		 {
			 if(key<a[0])
			 {
				 left=null;
				 right=a[0];
				 System.out.print("["+left+","+right+"]");
				 break;
			 }
			 if(key>a[len])
			 {
				 right=null;
				 left=a[len];
				 System.out.print("["+left+","+right+"]");
				 break;
			 }
			 if(a[i]<key&&key<a[i+1])
			 {
				 System.out.print("["+a[i]+","+a[i+1]+"]");
				 break;
			 }
		
	    }
	}

}
