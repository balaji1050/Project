package oops;

public class Polymorphism_MOL {
	
	
	
	void addition() {
		
		int a=10;
		int b =20;
		int c =a+b;
		System.out.println(c);
	}
	
	void addition(int a) {
		
		
		System.out.println("Resule :"+a);
	}
	
	void additiuon(String a) {
		
		System.out.println("Resule :"+a);
		
	}
	
	void addition(String a,String b) {
		
		System.out.println("Resule :"+ a+b);
	}
	
	void addition(int a,int b) {
		
		int c=a+b;
		System.out.println("Resule :"+c);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polymorphism_MOL caller = new Polymorphism_MOL();
		caller.addition();
		caller.addition(54);
		caller.additiuon("Welcome World");
		caller.addition("New","Delhi");
		caller.addition(10, 10);
	}

}
