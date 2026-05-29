package samplepackage;

public class OnlinePayments {
	String upi;
	int pass;
	String user;
	long acc;
	String ifsc;
	String branch;

	void payment(String upi) {
		this.upi = upi;
		System.out.println(upi);
	}

	void payment(String user, int pass) {
		this.user = user;
		this.pass = pass;
		System.out.println(user+" "+pass);
	}

	void payment(long acc, String ifsc, String branch) {
		this.acc = acc;
		this.ifsc = ifsc;
		this.branch=branch;
		System.out.println(acc+" "+ifsc+" "+branch);
	}

	public static void main(String[] args) {
		OnlinePayments o=new OnlinePayments();
		o.payment("8861@oksbi");
		o.payment("ganesh",886143);
		o.payment(345679889,"SBIBHJK0932","RAICHUR");
	}



}
