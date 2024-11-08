package esakkiganesh;

public class Str1ConStr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="aa";
		String s2="ab";
		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();
		char[] result=new char[a1.length];
		for(int i=0;i<a1.length;i++)
		{
			for(int j=i+1;j<a1.length;j++)
			{
				if(a1[i]>a1[j])
				{
					char smallest;
					smallest=a1[j];
					a1[j]=a1[i];
					a1[i]=smallest;
			
				}
			}
		}
		for(int i=0;i<a2.length;i++)
		{
			for(int j=i+1;j<a2.length;j++)
			{
				if(a2[i]>a2[j])
				{
					char smallest;
					smallest=a2[j];
					a2[j]=a2[i];
					a2[i]=smallest;
			
				}
			}
		}
		System.out.print("Str1: ");
		for(int i=0;i<a1.length;i++)
		{
			System.out.print(a1[i]);
		}
		System.out.println();
		System.out.print("str2: ");
		for(int i=0;i<a2.length;i++)
		{
			System.out.print(a2[i]);
		}
		System.out.println();
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
			  if(a1[i]==a2[j])
			  {
				result[i]=a1[i];
			  }

		    }
		}
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]);
		}
		System.out.println();
		int count=0;
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]!=result[i])
			{
				System.out.print("Str1 not in Str2");
			}
			else
			{
				count++;
			}
		}
		if(count==a1.length)
		{
			System.out.println("str1 present in str2");
		}

		
	}

}
