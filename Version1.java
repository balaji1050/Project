package oops;

public class Version1 {
	
	
	public void layout() {
		
		System.out.println("Version 1");
			System.out.println("Red colour menu");
	}
}

class Version2 extends Version1 {
	
	 public void layout2() {
    	
    	 System.out.println("Version 2");
			System.out.println("Blue colour menu");
    	 
     }
}

class Version3 extends Version2 {
	
	public void layout3() {
		
		 System.out.println("Version 3");
			System.out.println("Green colour menu");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Version3 caller = new Version3();
	
	    caller.layout();
		caller.layout2();
		caller.layout3();
		
	}

}
