package esakkiganesh;

public class PolymorphismOverriding2 {
	public void play() {
		System.out.println("kid playing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismOverriding2 obj=new PolymorphismOverriding2();
		PolymorphismOverriding1 obj1=new PolymorphismOverriding1();
		obj1.play();
		obj.play();
		obj1.atm();

	}

}
