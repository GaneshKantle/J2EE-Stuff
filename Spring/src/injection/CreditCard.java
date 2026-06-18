package injection;

public class CreditCard implements Payment{
	
	@Override
	public boolean doPayment() {
		System.out.println("Payment done by using Credit Card");
		return true;
	}

}
