package esakkiganesh;

public class Interface implements BankRules,FamilyRules{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface ifce=new Interface();
		ifce.idcard();
		ifce.dress();
		ifce.care();
		BankRules.report();
		System.out.println(BankRules.salary);
		FamilyRules.timespend();
		

	}

	@Override
	public void dress() {
		// TODO Auto-generated method stub
		System.out.println("formaldesscode");
		
	}

	@Override
	public void idcard() {
		// TODO Auto-generated method stub
		System.out.println("must wear idcard");
		
	}

	@Override
	public void care() {
		// TODO Auto-generated method stub
		{
			System.out.println("family care");
		}
		
	}

}
