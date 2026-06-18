package injection;

public class BillGenerator {
	private Payment p;
	
	public BillGenerator(Payment p) {
		this.p=p;
	}
	
	public static void main(String args[]) {
		Payment p = new UPI();
		BillGenerator bg=new BillGenerator(p);
		if(p.doPayment()) {
			System.out.println("Bill Genearated");
		}
		else {
			System.out.println("Bill Not Genearated");
		}
	}

}
