package streamapi;

import java.sql.*;
import java.util.*;
import java.util.stream.Stream;

class Emp {
	Integer eid;
	String fname;
	String lname;
	String jon;
	Double sal;
	Integer dno;

	public Emp(Integer eid, String fname, String lname, String jon, Double sal, Integer dno) {
		super();
		this.eid = eid;
		this.fname = fname;
		this.lname = lname;
		this.jon = jon;
		this.sal = sal;
		this.dno = dno;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", fname=" + fname + ", lname=" + lname + ", jon=" + jon + ", sal=" + sal + ", dno="
				+ dno + "]";
	}

}

class Dept {
	Integer dno;
	String dname;

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

	Integer lid;
}

class DataFromDB {
	public static Connection reqCon() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company_1", "root", "root123");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}


	public static List<Emp> getAllEmp() {
		List<Emp> eList = new ArrayList<Emp>();
		Emp e = null;
		Connection con = DataFromDB.reqCon();
		try {
			PreparedStatement ps = con.prepareStatement("SELECT * FROM EMP");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				e = new Emp(rs.getInt("eid"), rs.getString("fname"), rs.getString("lname"), rs.getString("job"),
						rs.getDouble("sal"), rs.getInt("dno"));
				eList.add(e);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return eList;
	}
	}

public class Streamapi {

	public static void main(String[] args) {
		Stream<Integer> s1 =Stream.of(2,4,5,6,34);
		s1.forEach(System.out::println);
		
		List<String> list = Arrays.asList("Ganesh", "Kantle");
		list.stream().forEach(System.out::println);
		
		System.out.println(DataFromDB.getAllEmp());
		
	}

}
