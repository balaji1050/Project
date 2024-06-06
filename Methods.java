package test;

public class Methods {
	
	void addition() {
		
		int a=20;
		int b=10;
		int c;
		
		c=a+b;
		
		System.out.println("The sum of value is : "+c);	
		
	}
	
	void sub(int a,int b) {
		int c=a-b;
		
		System.out.println("The Result is : "+c);
	}
	
	void str(String a,String b,String c) {
		
		System.out.println("The Full Name is :"+ a+b+c);
		
	}

       public static void main(String[] args) {
		// TODO Auto-generated method stub
    	   
    	   Methods dext=new Methods();
    	   dext.addition();
    	   dext.sub(7, 5);
           dext.str(" Devendiran ", "Balaji ", "Bala");
	}

}