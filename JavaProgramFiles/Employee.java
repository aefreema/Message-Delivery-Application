import java.util.Hashtable;

public class Employee{
    public Department dept;
	public String empNum;            //primary key
	public String password;
	public Facility fclty;
	public String fName;
	public String lName;
	public String jobTitle;
	public Hashtable<String, Report> reports = new Hashtable<>();
	public static Hashtable<String, Employee> employees = new Hashtable<>();
	
	public Employee(Department dep, Facility fac, String password, String first, String last, String job, String empNo) {
	    this.dept = dep; this.fclty = fac; this.password = password; this.fName = first; this.lName = last; this.jobTitle = job;
		this.empNum = empNo;
		
		dept.employees.put(empNum, this);
		dept.deptHS.numEmp++;
		fac.employees.put(empNum, this);
		employees.put(empNum, this);
	}
	
	public String toString() {
	    return (empNum + " " + dept.deptNo + " " + fclty.facNo + " " + lName + ", " + fName + " " + jobTitle);
	}
}