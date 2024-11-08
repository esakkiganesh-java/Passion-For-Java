package esakkiganesh;

import java.util.Arrays;

public class StringUtils {

	private static final String newline  = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringUtils STR=new StringUtils();
		String s="esakki ganesh";
		String s1="Hello";
		String s2="World";
		System.out.println("String s: "+s);
		STR.length(s, 0);
		STR.Reverse(s, null);
		STR.Size(s, null,(char) 'h', 0);
		STR.FirstIndex(s, null, 0, (char) 'k');
	    STR.LastIndex(s, null, 0, (char) 'a');
		STR.Equals("Ganesh","ganesh", null, null);
		STR.SubString(0, s, null);
		STR.Palindrom("madam", null, 0, 0);
		STR.Newline(s1,s2);
		STR.Add(s1,s2, s);
		STR.Char(s);
		STR.Getchar(s,2,null);
		
 }
	private void Getchar(String s,int i,char[] a)
	{
		a=s.toCharArray();
		for(int j=0;j<a.length;j++)
		{
			if(i==j)
			{
				System.out.print(i+" index position in string is "+a[i]);
			}
		
		}
		
	System.out.println();	
	}
	private void Char(String s) {
		// TODO Auto-generated method stub
	System.out.print("Char of String: ");
	for(int i=0;i<s.length();i++)
	{
		System.out.print(s.charAt(i)+" ");
	}
	System.out.println();	
	}
	private void Add(String s1, String s2,String s3) {
		// TODO Auto-generated method stub
		String s =(s1+" "+s2);
		System.out.print("String S1+S2= "+s);
		System.out.println();
		
	}
	private void Newline(String s1,String s2)
	{
	 System.out.print("String1: "+s1+"\n"+"String2: "+s2);
	 /*
	  System.out.println(s1);
	  System.out.println(s2);
	  
	  */
	 System.out.println();
	}

private void  Palindrom(String s,char[] a,int count1,int count) {
		// TODO Auto-generated method stub
	//String s="abcba";
	a=s.toCharArray();
	count1=(a.length/2)+1;
	count=0;
	System.out.println();
	for(int i=0,j=a.length-1;i<=j;i++,j--) {
		if(a[i]==a[j]) 
		{
		 count++ ;	
		}
	 }
     if(count1==count)
     {
    	 System.out.print("palindrom: "+s);
     }
     else {
    	 System.out.println("not palindrom: "+s);
     }
     System.out.println();

 }
private void SubString(int index,String s,char[] a) {
		// TODO Auto-generated method stub
	index=3;
	//String s="Esakki Ganesh";
	a=s.toCharArray();
	System.out.print("Substring: ");
	for(int i=index;i<a.length;i++)
	{
		System.out.print(a[i]);
	}
		
	}

private void Equals(String s1,String s2,char[] a,char[] b) {
		// TODO Auto-generated method stub
		//String s1="Ganesh";
		//String s2="Ganesh";
	     a=s1.toCharArray();
	     b=s2.toCharArray();
	     int count=0;
		if(s1.length()!=s2.length())
		{
			System.out.println("Strings are not equal");
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				System.out.println("Strings are not equal");
				break;
			}
			else {
				count++;
			}
		}
		if(count==b.length)
		{
			System.out.println("Strings are Equal");
		}
		
		
		}

	private void LastIndex(String s,char[] c,int position,char a) {
		// TODO Auto-generated method stub
		//String s="Esakki Ganesh";
		c=s.toCharArray();
		position=0;
		//a='a';
		for(int i=c.length-1;i>0;i--)
		{
			if(a==c[i])
			{
			position=i;	
			break;
			}
		}
		System.out.println();
		System.out.println("Last index: "+position);
		
		
		
	}

	private void FirstIndex(String s,char[] c,int position,char a) {
		// TODO Auto-generated method stub
		//String s="Esakki Ganesh";
		 c=s.toCharArray();
		position=0;
	  //  a='k';
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==a)
			{
			position=i;
			break;
			}
		}
		System.out.println();
		System.out.print("First Index: "+position);
		
	}

	private void Size(String s,char[] ar,char ch,int count) {
		// TODO Auto-generated method stub
		//String s="Esakki ganesh";
		ar=s.toCharArray();
		//ch='h';
		count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==ch)
			{	
			  count++;	
			}
		}
		System.out.println();
		System.out.print("size of element: "+count);
		
	}

	private void Reverse(String s,char[] a) {
		// TODO Auto-generated method stub
		//String s="hsenag ikkase";
		a=s.toCharArray();
		System.out.print("Reverse string: ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		} 
	}

	private void length(String s,int L) {
		// TODO Auto-generated method stub
		//String s= "Esakki Ganesh";
		 L=0;
		for(int i=0;i<s.length();i++)
		{
		   L++;	
		}
		System.out.println("length of the String: "+L);
		}

}
