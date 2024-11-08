package esakkiganesh;

public class RemoveLeadZer0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="00000000000000012356090";
		char[] a=s.toCharArray();
		char ch='0';
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=ch)
			{
				break;
			}
			else{
				count++;
			}
			
		}
		System.out.println(count);
		for(int i=count;i<a.length;i++)
		{
			System.out.print(a[i]);
		}

	}

}
