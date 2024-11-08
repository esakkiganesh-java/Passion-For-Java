package esakkiganesh;

public class PolymorphismOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismOverloading a=new PolymorphismOverloading();
		PolymorphismOverloading b=new PolymorphismOverloading();
		PolymorphismOverloading c=new PolymorphismOverloading();
		a.fillform("aaa",1,"a@.com");
		b.filform('b',2,"b@.com");
		c.filform("ccc",3,"c@.com");

	}

	private void filform(java.lang.String string2, int i, java.lang.String string22) {
		// TODO Auto-generated method stub
		System.out.println(string2+" "+i+" "+string22);
	}

	private void filform(char c, int i, java.lang.String string2) {
		// TODO Auto-generated method stub
	 System.out.println(c+" "+i+" "+string2);
		
	}



	private void fillform(String string, int i, String string2) {
		// TODO Auto-generated method stub
		System.out.println(string +" " +i+" "+string2);
		
	}

}
