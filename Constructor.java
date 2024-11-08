package esakkiganesh;

public class Constructor {
	String name;
	int id;
	int rollno;
	public Constructor(String name,int id,int rollno)
	{
	  this.name=name;
	  this.id=id;
	  this.rollno=rollno;
	  System.out.println("Constructor is calling deafult");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor student1=new Constructor("Ganesh",1,001);
		Constructor student2=new Constructor("New",2,002);
		Constructor student3=new Constructor("old",3,003);
		student1.details();
		student2.details();
		student3.details();

	}

	private void details() {
		// TODO Auto-generated method stub
	System.out.println(name);
	System.out.println(id);
	System.out.println(rollno);
		
	}

}
