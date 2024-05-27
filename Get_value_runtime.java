package trail;

import java.util.Scanner;

public class Get_value_runtime {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

}
