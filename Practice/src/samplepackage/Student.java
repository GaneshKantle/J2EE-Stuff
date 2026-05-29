package samplepackage;

public class Student {

	    // 6 instance variables
	    int id;
	    String name;
	    double salary;
	    String dept;
	    String email;
	    String city;

	    // non-static method
	    void show() {
	        System.out.println(id + " " + name);
	    }

	    public static void main(String[] args) {

	        // static area → creating objects
	        Student s1 = new Student();
	        Student s2 = new Student();

	        // assigning values
	        s1.id = 1;
	        s1.name = "Gani";

	        s2.id = 2;
	        s2.name = "Ravi";

	        // accessing non-static area
	        s1.show();
	        s2.show();
	    }
}
