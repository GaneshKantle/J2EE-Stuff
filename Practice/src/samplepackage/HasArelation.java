package samplepackage;


//STRONG HAS A REALTIONSHIP

//class department {
//	String deptName;
//
//	department(String deptName) {
//		this.deptName = deptName;
//	}
//	void displayDept() {
//		System.out.println("Dept Name: "+deptName);
//	}
//}
//
//class University {
//	String UniName;
//	department dept;
//
//	University(String UniName) {
//		this.UniName = UniName;
//		dept = new department("CSE");
//	}
//	
//	void displayUni() {
//	System.out.println("University Name: "+UniName);
//	dept.displayDept();
//	}
//	
//}


//WEAK HAS A REALTIONSHIP
//class Department {
//	String deptName;
//
//	Department(String deptName) {
//		this.deptName = deptName;
//	}
//	void displayDept() {
//		System.out.println("Dept Name: "+deptName);
//	}
//}
//
//class University {
//	String UniName;
//	Department dept;
//
//	University(String UniName, Department dept) {
//		this.UniName = UniName;
//		this.dept=dept;
//	}
//	
//	void displayUni() {
//	System.out.println("University Name: "+UniName);
//	dept.displayDept();
//	}
//	
//}



//public class HasArelation {
//
//	public static void main(String[] args) {
//		Department u1= new Department("CSE");
//		University u2= new University("SDM",u1);
//		u2.displayUni();
//	}
//}
