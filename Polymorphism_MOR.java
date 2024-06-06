package oops;

public class Polymorphism_MOR {
	
	
	public void house() {
		
		System.out.println("House colour is Red ");
	}
	
}

class Polymorphism_MOR1 extends Polymorphism_MOR {
	
	public void car()
	{
		System.out.println("Car colour is Blue ");
		
	}
	
public void house() {
		
		System.out.println("House colour is Green ");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polymorphism_MOR1 caller = new Polymorphism_MOR1();
		caller.house();
		caller.car();
	}

}
