package interfacejava8;
import java.util.function.Predicate;

interface Names {
	String lenName(String[] str);
}

public class EvenOddInterface {
	public static void main(String[] args) {
		String[] str= {"Ganesh","Kantle","Rukmini","Vasanth"};
		Predicate<String> p= (a)->(a.length()>=5);
		for(String s:str) {
			if(p.test(s)) {
				System.out.println(s);
			}
		}
	}

}
