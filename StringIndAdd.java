package esakkiganesh;

public class StringIndAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="GeeksGeeks";
		String s2=" for ";
		char[]a=s.toCharArray();
		char[]b=s2.toCharArray();
		int index=5;
		char[]c=new char[a.length+b.length];
		int c1=c.length;
		for(int i=0;i<index;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<index+b.length;i++)
		{
			c[c1+i]=b[i];
		}
		for(int i=index;i<c.length;i++)
		{
			c[c1+i]=a[index];
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
	
	}
}
