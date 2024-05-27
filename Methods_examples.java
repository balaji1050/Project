package trail;

import java.util.Scanner;

public class Methods_examples {

	
	void addition() {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("Resut C : "+c);
	
	}
	
	void sub(int a,int b) {
		
		int c=a-b;
		System.out.println("Resut C : "+c);
		
		}
	
	
	void str(String a,String b,String c) {
		System.out.println("The value is : "+ a+b+c);
		
	}
	
	void Mult(int a,int b) {
		int c=a*b;
		System.out.println("Result is : "+c);
		
	}
	
	void test() {
	
	int a;
	int b;
	int c;
	
	Scanner data= new Scanner(System.in);
		System.out.println("Enter the value a :");
		a=data.nextInt();
		
		System.out.println("Enter the value b :");
		b=data.nextInt();
	
	
	
	c=a+b;
    
    System.out.println("Print The value C is : "+c);   
    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods_examples dexter=new Methods_examples();
		dexter.addition();
		dexter.sub(50,3);
		dexter.str("X", "Y", "Z");
		dexter.Mult(55, 56);
		dexter.test();
		
	}
	
		
}