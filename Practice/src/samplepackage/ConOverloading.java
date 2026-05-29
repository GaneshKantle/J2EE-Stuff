package samplepackage;

public class ConOverloading {

		static String bankName="SBI";
		static double minBal=1000;
		
		String accName;
		double amount;
		String accType;
		
		ConOverloading(){
			accName="Unknown";
			amount=minBal;
			accType="Savings";
		}
		ConOverloading(String accName){
			this.accName=accName;
			this.amount=minBal;
			this.accType="Savings";
		}
		ConOverloading(String accName, double amount){
			this.accName=accName;
			this.amount=minBal;
			this.accType="Current Account";
		}
		ConOverloading(double amount, String accName){
			this.amount=minBal;
			this.accName=accName;
			this.accType="Savings Account";
		}
	public static void main(String[] args) {
		
		ConOverloading o1 = new ConOverloading();
		System.out.println(o1.accName+o1.amount+o1.accType);
		ConOverloading o2 = new ConOverloading("Ganesh");
		System.out.println(o2.accName+o2.amount+o2.accType);
		ConOverloading o3 = new ConOverloading("Kantle",37.3765432);
		System.out.println(o3.accName+o3.amount+o3.accType);
		ConOverloading o4 = new ConOverloading(4534.3546,"Classyyy");
		System.out.println(o4.accName+o4.amount+o4.accType);
	}

}
