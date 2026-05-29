package interfacejava8;
import java.util.function.Predicate;

interface Addition{
	int add (int a, int b);
}

interface EvenOrOdd{
	String validate(int a);
}


//class imp implements EvenOrOdd{
//	public String validate(int a) {
//		if(a%2==0) {
//			return "Even";
//		}
//		else {
//			return "False";
//		}
//	}
//}

public class LambdaExpresssion {

	public static void main(String[] args) {
//		Addition ad=(a,b)->a+b;
//		System.out.println(ad.add(2, 5));
//		
//		EvenOrOdd e=(a)->{
//			if(a%2==0) {
//				return "Even";
//			}
//			else {
//				return "False";
//			}
//		};
//		System.out.println(e.validate(8));
//		
//		Predicate<Integer> p = (a)-> a%2==0;
//		if(p.test(20)) {
//			System.out.println("Even");
//		}
//		else {
//			System.out.println("Odd");
//		}
		
//		Predicate<String> s = (a)->(a.charAt(0)=='A');
//		if(s.test("AGanesh")) {
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
		
		
	}

}
