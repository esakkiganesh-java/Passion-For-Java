package esakkiganesh;

public class StringSubInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1="Esakki anesh N";
       String s2="G";
       int index=7;
       char[] string3=new char[s1.length()+s2.length()];
       for(int i=0;i<index;i++)
       {
    	   string3[i]=s1.charAt(i);
       }
      for(int i=0;i<s2.length();i++)
       {
    	   string3[index+i]=s2.charAt(i);
       }
      for(int i=index;i<s1.length();i++)
      {
    	  string3[s2.length()+i]=s1.charAt(i);
      }
       
      for(int i=0;i<string3.length;i++)
       {
    	   System.out.print(string3[i]);
       }
	}

}
