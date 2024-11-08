package esakkiganesh;

public class CharDeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="AABABAA";
		char[] a=s.toCharArray();
		char A='A';
		char B='B';
		int count=0;
		int count1=a.length;
		System.out.println(count1);
		for(int i=0;i<a.length-1;i++)//AABAAB
		{
	
			
	            if((a[i]==A&&a[i+1]==B)||(a[i]==B&&a[i+1]==A))
				{
				     count++;
				     System.out.println(i+" "+(i+1));
				    i=i+1;
				}
				     
		}
		System.out.println("count= "+count);
		System.out.println("Deletions: "+ (count1-(count*2)));

	}

}
