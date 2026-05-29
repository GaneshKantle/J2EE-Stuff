package samplepackage;

public class This {
	String name;
	
	 This(String name) {
		this.name=name;
		System.out.println(name);
	}
	 
	 void Thiss(String name) {
		 this.name=name;
		 System.out.println("hdyufhdfkjs               "+name);
	 }

	public static void main(String[] args) {
		
		This t1 = new This("Ganesh");
		This t2 = new This("Kantle");
		System.out.println();
		t1.Thiss("Ganesh");
//		System.out.println(t1.name);
		
	}

}
