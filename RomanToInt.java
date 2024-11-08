package esakkiganesh;

public class RomanToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MCMXCIV" ;
		int op = 0;
		for(int i = 0; i < s.length(); i++)
		{  
		 if( i == 0) {
			 if(s.charAt(i) == 'I')
			    {
				 op = op + 1;
			    }
			 if(s.charAt(i) == 'V')
			    {
				 op = op + 5;
			    }
			 if(s.charAt(i) == 'X')
			    {
				 op = op + 10;
			    }
			 if(s.charAt(i) == 'L')
			    {
				 op = op + 50;
			    }
			 if(s.charAt(i) == 'C')
			    {
				 op = op + 100;
			    }
			 if(s.charAt(i) == 'D')
			    {
				 op = op + 500;
			    }
			 if(s.charAt(i) == 'M')
			    {
				 op = op + 1000;
			    }
		 }
		 else {
			if(s.charAt(i) == 'I')
		    {
			 op = op + 1;
		    }
			if(s.charAt(i) == 'V' && s.charAt(i-1) == 'I')
		    {
			 op = op + 4;
		    }
			if(s.charAt(i) == 'X' && s.charAt(i-1) == 'I')
		    {
			 op = op + 9;
		    }
			if(s.charAt(i) == 'L' && s.charAt(i-1) == 'X')
		    {
			 op = op + 40;
		    }
			if(s.charAt(i) == 'C' && s.charAt(i-1) == 'X')
		    {
			 op = op + 90;
		    }
			if(s.charAt(i) == 'D' && s.charAt(i-1) == 'C')
		    {
			 op = op + 400;
		    }
			if(s.charAt(i) == 'M' && s.charAt(i-1) == 'C')
		    {
			 op = op + 900;
		    }
		 }
		}
  System.out.print("Output : " +op);
	}

}
