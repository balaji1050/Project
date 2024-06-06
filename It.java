package oops;

public interface It { // project manager 1
	
	void add(int a);
	void sub();
	void multi();
	void test();
	
}

interface It2{ // project manager 2
	
	void div();
	void mod();
}
 
 class Chil implements It,It2{
	 
	public  void add(int a) {
		 System.out.println("add");
	 }
	 
	public  void sub() {
		 System.out.println("sub");
 }
	
	public  void multi() {
		 System.out.println("multi");
}
	
	public  void test() {
		 System.out.println("test");
}
	
	public  void div() {
		 System.out.println("div");
}
	public  void mod() {
		 System.out.println("mod");
}

public static void main(String args[]) {
	
	
	Chil obj = new Chil();
	obj.add(3);
	obj.sub();
	obj.multi();
	obj.test();
	obj.div();
	obj.mod();
	
}
 }
