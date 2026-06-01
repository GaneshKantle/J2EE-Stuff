package interfacejava8;
import java.sql.*;
import java.util.*;
import java.util.function.*;
class Emp {
	Integer eid;
	String fname;
	String lname;
	String job;
	Double sal;
	Integer dno;

	public Emp(Integer eid, String fname, String lname, String job, Double sal, Integer dno) {
			this.eid=eid;
			this.fname=fname;
			this.lname=lname;
			this.job=job;
			this.sal=sal;
			this.dno=dno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return Objects.equals(dno, other.dno);
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", fname=" + fname + ", lname=" + lname + ", job=" + job + ", sal=" + sal + ", dno="
				+ dno + "]";
	}
}

class Dataa {
	public static List<Emp> Data() {
		Emp e=null;
		List<Emp> eList=new ArrayList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company_1", "root", "root123");
			PreparedStatement ps= con.prepareStatement("SELECT * FROM EMP");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				e=new Emp(rs.getInt("eid"),rs.getString("fname"),rs.getString("lname"),rs.getString("job"),rs.getDouble("sal"),rs.getInt("dno"));
				eList.add(e);
			}
			
		} catch (ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		
		return eList;
	}
}




public class PredicateFetch {
	int id;
	PredicateFetch(int id){
		this.id=id;
		System.out.println(id);
	}

	

	public boolean equals(Object obj) {
		if( obj instanceof PredicateFetch) {
			PredicateFetch fp=(PredicateFetch) obj;
			return id==fp.id;
		}
		return false;
	}
	
	public static void main(String[] args)  {
		List<Emp> empData=Dataa.Data();
		Predicate<Emp> p=(a)->a.fname.startsWith("K");
		for(Emp e:empData) {
			if(p.test(e)) {
				System.out.println(e.fname);
			}
		}
		
		
		Consumer
		
		<Emp> c=(e)-> System.out.println("");
		c.accept(new Emp(1,"Ganesh","Kantle","Dev",23000.00,10));
		
		
		Supplier<Emp> s=()->empData.get(0);
		Emp firstData=s.get();
		System.out.println(firstData);
		
		Supplier<String> s1=()->"Nothing";
		System.out.println(s1.get());
		
		
		PredicateFetch pf=new PredicateFetch(98);
	
	
		System.out.println(pf.equals(98));
		
		
	}

}


