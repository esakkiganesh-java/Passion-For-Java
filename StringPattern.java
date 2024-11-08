package esakkiganesh;

public class StringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="PROGRAM";
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j&&i!=(a.length/2)&&j!=(a.length/2))
				{
					System.out.print(a[i]);
				}
				if(i+j==(a.length-1))
				{
					System.out.print(" "+a[i]);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();		
		}
	}
}
