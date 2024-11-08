package esakkiganesh;

public class SumOfDigits {

	public static void main(String[] args) {
       // TODO Auto-generated method stub
		String s =  "145";
		char[] a = s.toCharArray();
		//int [] a = { 1, 2, 3, 4, 5};
		int total = 0 ;
		for(int i = 0; i < a.length ; i++)
		{
			 int digit = a[i] - '0';
			System.out.println(total+" = "+a[i]+" + "+i);
		    total =(total+digit);
	
		}
		System.out.print("SumOfDigits : "+total);

	}

}
