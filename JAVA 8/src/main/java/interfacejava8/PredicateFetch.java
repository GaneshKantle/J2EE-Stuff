package interfacejava8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import jdk.javadoc.internal.doclets.toolkit.util.Comparators;

class Emp {
	Integer id;
	String fname;
	String lname;
	String job;
	Double salary;
	Integer dno;

	public Emp(Integer id, String fname, String lname, String job, Double salary, Integer dno) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.job = job;
		this.salary = salary;
		this.dno = dno;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", fname=" + fname + ", lname=" + lname + ", job=" + job + ", salary=" + salary
				+ ", dno=" + dno + "]";
	}
}

class Dept {
	Integer dno;
	String dname;
	Integer lid;

	public Dept(Integer dno, String dname, Integer lid) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.lid = lid;
	}

	@Override
	public String toString() {
		return "Dept [dno=" + dno + ", dname=" + dname + ", lid=" + lid + "]";
	}
}

class DBConnection {
	public static Connection reqCon() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company_1", "root", "root123");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public static List<Emp> getEmp() {
		List<Emp> elist = new ArrayList();
		Emp e1 = null;
		Connection con = reqCon();
		try {
			PreparedStatement ps = con.prepareStatement("Select * from emp");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				e1 = new Emp(rs.getInt("EID"), rs.getString("FNAME"), rs.getString("LNAME"), rs.getString("JOB"),
						rs.getDouble("SAL"), rs.getInt("DNO"));
				elist.add(e1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return elist;
	}

	public static List<Dept> getDept() {

		List<Dept> dlist = new ArrayList();
		Connection con = reqCon();
		Dept d = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company_1", "root", "root");
			PreparedStatement sp = con.prepareStatement("Select * from dept");
			ResultSet rs = sp.executeQuery();
			while (rs.next()) {
				d = new Dept(rs.getInt(1), rs.getString(2), rs.getInt(3));
				dlist.add(d);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dlist;
	}
}

public class PredicateFetch {
	public static void main(String[] args) {

//		System.out.println(args.length);
//		System.out.println(args[0]);

		List<Emp> elist = DBConnection.getEmp();
		List<Dept> dlist = DBConnection.getDept();

		// 1.wap to display the data employees who is working as salesman;
		System.out.println("--1. All Salesman--");
		elist.stream() // create the stream
				.filter(n -> n.job.equalsIgnoreCase("salesman")) // filter salesman record
				.forEach(System.out::println); // Iterate through the list collection

		System.out.println("\n--2. 112 Dno details--");
		elist.stream().filter(e -> e.dno == 112).forEach(System.out::println);

		System.out.println("\n--3. Not ceo's--");
		elist.stream().filter(e -> !e.job.equalsIgnoreCase("ceo")).forEach(System.out::println);

		System.out.println("\n--4. Sal > 45000--");
		elist.stream().filter(e -> e.salary > 45000).forEach(System.out::println);

		System.out.println("\n--5. Name starts with s--");
		elist.stream().filter(e -> e.fname.toLowerCase().startsWith("s")).forEach(System.out::println);

		System.out.println("\n--.6 Job role name starts with d--");
		elist.stream().filter(e -> e.job.toLowerCase().startsWith("d")).forEach(System.out::println);

		System.out.println("\n--.7 emp working is Salesman or Manager--");
		elist.stream().filter(e -> e.job.equalsIgnoreCase("salesman") || e.job.equalsIgnoreCase("manager"))
				.forEach(System.out::println);

		System.out.println("\n--.8 emp  40000 < sal < 100000 --");
		elist.stream().filter(e -> e.salary > 40000 && e.salary < 100000).forEach(System.out::println);

		System.out.println("\n--9. name ends with I or Y--");
		elist.stream().filter(e -> e.lname.toLowerCase().endsWith("i") || e.lname.toLowerCase().endsWith("y"))
				.forEach(System.out::println);

		System.out.println("\n--.10 emp working is Salesman or Manager in dept 110 or 111--");
		elist.stream().filter(e -> (e.job.equalsIgnoreCase("salesman") || e.job.equalsIgnoreCase("manager"))
				&& (e.dno == 110 || e.dno == 111)).forEach(System.out::println);

		System.out.println("\n--11. emp's sal > 35000");
		Stream<Emp> s1 = elist.stream();
		Consumer<Emp> c = System.out::println;
		Predicate<Emp> p = (e) -> e.salary > 35000;
		Stream<Emp> s2 = s1.filter(p);
		s2.forEach(c);

		System.out.println("\n-- Annual Salary --");
		Function<Emp, Double> f = e -> e.salary * 12;
		elist.stream().forEach(e -> System.out.println(f.apply(e)));

		System.out.println("\n-- Employee Full Name --");
		Function<Emp, String> f1 = e -> e.fname + " " + e.lname;
		elist.stream().forEach(e -> System.out.println(f1.apply(e)));

		System.out.println("\nEmp names starts with 's' ");
		elist.stream().filter(e -> e.fname.toLowerCase().startsWith("s")).forEach(e -> System.out.println(e.fname));

		System.out.println("\n12. All first names in uppercase");
		elist.stream().filter(e -> e.fname.toLowerCase().startsWith("s")).map(e -> e.fname.toUpperCase())
				.forEach(System.out::println);

		System.out.println("\n13. Name and sal for sal > 50000");
		elist.stream().filter(e -> e.salary > 50000).map(e -> e.fname + " " + e.lname + " " + e.salary)
				.forEach(System.out::println);

		System.out.println("\n14. name , job , dno , if emp is developer or tester in dept no 113");
		elist.stream()
				.filter(e -> e.job.equalsIgnoreCase("developer") || e.job.equalsIgnoreCase("tester") && e.dno == 113)
				.map(e -> e.fname + " - " + e.job + " - " + e.dno).forEach(System.out::println);

		System.out.println("\n15. Emp full name using map");
		elist.stream().map(e -> e.fname + " " + e.lname).forEach(System.out::println);

		System.out.println("\n16. Emp name in Siddarth Patil => Siddarth.P");
		elist.stream().map(e -> e.fname + "." + e.lname.substring(0, 1)).forEach(System.out::println);

		System.out.println("\n17. Half full name");
		elist.stream().map(e -> e.fname.substring(0, e.fname.length() / 2)).forEach(System.out::println);

		System.out.println("\n18. fname and lname if exceeds 4 character");
		elist.stream().filter(e1 -> e1.fname.length() > 4).map(e -> e.fname + " " + e.lname)
				.forEach(System.out::println);

		System.out.println("\n19. job role from empData");
		elist.stream().map(e -> e.job).distinct().forEach(System.out::println);

		System.out.println("\n20. Diff depts in emp Data");
		elist.stream().map(e -> e.dno).distinct().forEach(System.out::println);

		System.out.println("\n21. emp fname , lname , sal , if the emp is Salesman or Manager");
		elist.stream().filter(e -> e.job.equalsIgnoreCase("salesman") || e.job.equalsIgnoreCase("manager"))
				.map(e -> e.fname + " " + e.lname + " " + e.salary + " " + e.job).forEach(System.out::println);

		System.out.println("\n22. first 5 emp data from emp list");
		elist.stream().limit(5).forEach(System.out::println);

		System.out.println("\n23. first 4 emp fname ");
		elist.stream().map(e -> e.fname).limit(4).forEach(System.out::println);

		System.out.println("\n24. 4th emp data");
		elist.stream().skip(3).limit(1).forEach(System.out::println);

		System.out.println("\n25. display first 10 record");
		elist.stream().limit(10).forEach(System.out::println);

		System.out.println("\n26. display 7th emp data");
		elist.stream().skip(6).limit(1).forEach(System.out::println);

		System.out.println("\n27. display 8th , 9th emp data");
		elist.stream().skip(7).limit(2).forEach(System.out::println);

		System.out.println("\n28. display first 3 emp data having even emp id ");
		elist.stream().filter(e -> e.id % 2 == 0).limit(3).forEach(System.out::println);

		System.out.println("\n29. emp records in asc order of sal");
		elist.stream().sorted(Comparator.comparing(e -> e.salary)).forEach(System.out::println);

		System.out.println("\n30. emp records in desc order of alphabetical order");
		elist.stream().sorted(Comparator.comparing((Emp e) -> e.fname).reversed()).map(e1 -> e1.fname)
				.forEach(System.out::println);

		System.out.println("\n31. emp records in desc order of sal");
		elist.stream().sorted(Comparator.comparing((Emp e) -> e.salary).reversed()).map(e1 -> e1.salary).distinct()
				.forEach(System.out::println);

		System.out.println("\n32. last 4 record of emp data");
		elist.stream().sorted(Comparator.comparing((Emp e) -> e.id).reversed()).limit(4).forEach(System.out::println);

		System.out.println("\n33. 2nd max sal");
		elist.stream().sorted(Comparator.comparing((Emp e) -> e.salary).reversed()).skip(1).distinct().limit(1)
				.forEach(System.out::println);

		System.out.println("\n33. 3rd min sal");
		elist.stream().sorted(Comparator.comparing((Emp e) -> e.salary)).skip(2).distinct().limit(1)
				.forEach(System.out::println);

//		System.out.println("--.10 emp working is Salesman or Manager in dept 110 or 111--");
//		elist.stream()
//		     .filter(e -> e.salary > 35000)
//		     .forEach(System.out::println);

		List<Emp> empList = elist.stream().filter(e -> e.job.equals("Salesman")).collect(Collectors.toList());
		System.out.println(empList);

		// 42. WAP to display the dept data in map format

		// 43. WAP to display the emp data who is obtaining max salary from emp list.\

		System.out.println("------43------");
		Optional<Emp> max_sal = elist.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
		System.out.println(max_sal.orElse(null));

		// 44. WAP to display to emp data who is obtaining min salary from emp list
		System.out.println("------44------");
		Optional<Emp> min_sal = elist.stream().collect(Collectors.minBy(Comparator.comparing(e -> e.salary)));
		System.out.println(min_sal.orElse(null));

		// 45. WAP to display to max salary in each dept.
		System.out.println("------45------");
		Map<Integer, Optional<Emp>> sal_by_dept = elist.stream().collect(Collectors.groupingBy(e -> e.dno, Collectors.maxBy(Comparator.comparing(e -> e.salary))));
		sal_by_dept.forEach((dno, o) -> System.out.println(dno + " " + sal_by_dept));
		
		// 46. WAP to display to min salary in each dept.
		System.out.println("------46------");
		Map<Integer, Optional<Emp>> min_sal_dept = elist.stream().collect(Collectors.groupingBy(e->e.dno, Collectors.minBy(Comparator.comparing(e->e.dno))));
		min_sal_dept.forEach((dno,o) -> System.out.println(dno+" "+min_sal_dept));
		
		// 47. WAP to display to numbers of emp in each dept.
		System.out.println("------47------");
		Map<Integer, Long> count_dept=
				elist.stream()
					.collect(Collectors.groupingBy(e->e.dno,Collectors.counting()));
				count_dept.forEach((dno, count)->System.out.println(dno+"="+count));
				
		//48. WAP to display the number of emp in each job role
		System.out.println("------48------");	
		Map<Object, Long> count_role=
				elist.stream()
				.collect(Collectors.groupingBy(e->e.job, Collectors.counting()));
				count_role.forEach((job, count)->System.out.println(job+"="+count));
		
		//49. WAP to display the max salary in each job role 
		System.out.println("------49------");
		Map<String, Optional<Emp>> sal_role=
				elist.stream()
					.collect(Collectors.groupingBy(e->e.job,Collectors.maxBy(Comparator.comparing(e->e.job))));
		 		sal_role.forEach((ejob, sal)->System.out.println(ejob+"="+sal));
		 		
		//50. WAP to display the avg salary in each dept
		System.out.println("------50------");
		Map<Integer, Double> avgsal_dept = 
		elist.stream()
			.collect(Collectors.groupingBy(e->e.dno, Collectors.averagingDouble(e->e.salary)));
		avgsal_dept.forEach((dno, sal)->System.out.println(dno+"="+sal));
			
		//51. WAP to display the total salary in each dept 
		System.out.println("------51------");
		Map<Integer, Double> totalsal_dept = 
		elist.stream()
			.collect(Collectors.groupingBy(e->e.dno, Collectors.summingDouble(e->e.salary)));
		totalsal_dept.forEach((dno, sal)->System.out.println(dno+"="+sal));
		
		//52. WAP to display the first emp from emp list
		System.out.println("------52------");
		Optional <Emp> emp=
		elist.stream()
		.findFirst();
		System.out.println(emp.orElse(null));
		
		
		//53. WAP to display the first emp from each dept
		System.out.println("------53------");
		List<Integer> first_dept=
				elist.stream()
				.map(d->d.dno)
					.distinct()
					.collect(Collectors.toList());
			
		for(Integer dep:first_dept) {
			Optional<Emp> o=elist.stream().filter(d->d.dno==dep).findFirst();
			System.out.println(dep+" - "+o.orElse(null));
			
		}
		
		// 54. WAP to check whether any emp belong to the id 115
		System.out.println("------54------");
		Boolean res1 = 
				elist.stream()
					.anyMatch(e->e.dno==115);
				System.out.println(res2);
				
		
		// 55. WAP to check whether any emp belong to the id 115
		System.out.println("------55------");
		Boolean res2 = 
		elist.stream()
			.noneMatch(e->e.dno==115);
		System.out.println(res2); //true because no 
		
				
	}

}
