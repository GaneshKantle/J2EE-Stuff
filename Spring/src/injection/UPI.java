package injection;

public class UPI implements Payment{
	
	@Override
	public boolean doPayment() {
		System.out.println("Payment done by using UPI");
		return true;
	}

}
