// Syntax: 
package interfacejava8;

interface DCL{
	int add(int a, int b);
}

public class Demo7 {
	
	//Constructor
	public Demo7() {
		System.out.println("This is 0 Param");
	}
	public Demo7(int a, int b) {
		System.out.println("This is 2 Param");
	}
	
	public int add(int a, int b) {
		int c=a+b;
		System.out.println("Addition of A & B is: "+c);
	}
	
	public int multiple(int a, int b) {
		int c=a*b;
		System.out.println("Multiple of A & B is: "+c);
	}
	public int division(int a, int b) {
		int c=a/b;
		System.out.println("Division of A & B is: "+c);
	}
	
	public int subtract(int a, int b) {
		int c=a-b;
		System.out.println("Subtract of A & B is: "+c);
	}
	
	public static void main(String[] args) {
		
		DCL d=
				

	}

}
