package injection;

public class DebitCard implements Payment{
	
	@Override
	public boolean doPayment() {
		System.out.println("Payment done by using Debit Card");
		return true;
	}

}
