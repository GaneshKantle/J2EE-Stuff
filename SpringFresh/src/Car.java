
public class Car{
	private Engine eng;
	
	public Car() {
		System.out.println("0 param con of car");
	}
		
	public Car(Engine eng) {
		this.eng=eng;
	}
	
	public void rev() {
		eng.start();
	}
	
}
