package oops;

abstract class Abstract_outerline {
	
	
    abstract void add();
    abstract void sub();
    abstract void multi();
    void test() {
    	
    	System.out.println("Test colour red");
    }
    
}
    
    class Child extends Abstract_outerline{
    	
    	void add() {
    		
    		System.out.println("add");
    	}
        void sub() {
    		
    		System.out.println("sub");
    	}
        void multi() {
    		
    		System.out.println("multi");
    	}
    	
        void test() {
        	
        	System.out.println("Test colour Green");
        }
    
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child caller =new Child();
		caller.add();
		caller.sub();
		caller.multi();
		caller.test();
	}

}
