// Syntax: instance method syntax:Interface name :interface_ref_name::class_ref_name:method_name
package interfacejava8; 

interface DCL {
	void add(int a, int b);
}

class Impl implements DCL {
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("add is " + c);
	}
}

public class Demo7 {

	public Demo7() {
		System.out.println("0 param");
	}

	public Demo7(int a, int b) {
		System.out.println("param");
	}

	public void multiply(int a, int b) {
		System.out.println("mul is " + (a * b));
	}

	public static void subtract(int a, int b) {
		System.out.println("sub is " + (a - b));
	}

	public static void main(String[] args) {
		System.out.println("------------1----------");
		DCL d1 = new Impl();
		d1.add(20, 10);

		System.out.println("------------2------------");
		DCL d2 = (a, b) -> {
			d1.add(a, b);
		};
		d2.add(10, 10);

		System.out.println("------------3------------");
		Demo7 d3 = new Demo7();
		d3.multiply(10, 20);

		System.out.println("------------4------------");
		DCL d4 = (a, b) -> {
			d3.multiply(a, b);
			;
		};
		d4.add(12, 12);

		System.out.println("------------5------------");
		Demo7.subtract(20, 10);

		System.out.println("------------6------------");
		DCL d5 = (a, b) -> {
			Demo7.subtract(a, b);
		};
		d5.add(30, 20);

		System.out.println("------------7------------");
		
//instance method syntax:Interface name :interface_ref_name::class_ref_name:method_name
		DCL d6 = d3::multiply;
		d6.add(6, 2);

		System.out.println("------------8------------");
		// static method syntax:Interface name
		// :interface_ref_name::class_name:method_name
		DCL d7 = Demo7::subtract;
		d7.add(21, 1);
	}
}