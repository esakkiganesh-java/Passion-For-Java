package esakkiganesh;

public class Recursion {
     int total=0;
     int fact=1;
     int rev=0;
     String reve="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion obj=new Recursion();
		int value=obj.result(5);
		System.out.println(value);
		int factorial=obj.factresult(5);
		System.out.println(factorial);
		int res=obj.reversenum(12345);
		System.out.println(res);
		String s="Ganesh";
		int len=s.length();
		String reves=obj.reverseword(s,len);
		System.out.println(reves);
		



		
}
	private String reverseword(String s, int i) {
		// TODO Auto-generated method stub
		reve = reve+s.charAt(i-1);
		i--;
		if(i>0)
		{
			reverseword(s,i);
		}
		return reve;
	}
	private int reversenum(int no) {
		// TODO Auto-generated method stub
		rev = (rev*10) + (no%10) ;
		no = no / 10 ;
		if(no > 0)
		{
			reversenum(no);
		}
		return rev;
	}
	private int factresult(int no) {
		fact = fact * no;
		no--;
		if(no>0)
		{
			factresult(no);
		}
		return fact;
	}
	private int result(int no) {
		// TODO Auto-generated method 
       total=total+no;
       no--;
       if(no>0)
       {
    	   result(no);
       }
       return total; 
	}
}
