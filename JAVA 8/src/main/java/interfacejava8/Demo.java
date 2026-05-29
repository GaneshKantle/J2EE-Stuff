package interfacejava8;

interface Engine{
	void jfs();
	void pfs();
	
	default void Mern(){
		System.out.println("Mern Stack");
	}
	static void DevOps(){
		System.out.println("DevOps Started");
	}
}

class Yelahanka implements Engine{

	@Override
	public void jfs() {
		System.out.println("Yelahanka Java Full Stack");
	}

	@Override
	public void pfs() {
		System.out.println("Yelahanka Python Full Stack");
	}
	
	public void Mern(){
		Engine.super.Mern();
	}
	
}

class BTM implements Engine{

	@Override
	public void jfs() {
		System.out.println("BTM Java Full Stack");
	}

	@Override
	public void pfs() {
		System.out.println("BTM Python Full Stack");
	}
	public void Mern(){
		Engine.super.Mern();
	}
	
}

class Rajajinagar implements Engine{

	@Override
	public void jfs() {
		System.out.println("Rajajinagar Java Full Stack");
	}

	@Override
	public void pfs() {
		System.out.println("Rajajinagar Python Full Stack");
	}
	
}
public class Demo {

	public static void main(String[] args) {
		Yelahanka y = new Yelahanka();
		y.jfs();
		y.pfs();
		y.Mern();
		
		BTM b = new BTM();
		b.jfs();
		b.pfs();
		
		
		Rajajinagar r = new Rajajinagar();
		r.jfs();
		r.pfs();
		
		Engine.DevOps();
		

	}

}

//
//interface Demo1{
//	void test();
//}
//
//public class Demo{
//	public static void main(String args[]) {
//		Demo d=()->System.out.println("Nothing");
//	}
//}
