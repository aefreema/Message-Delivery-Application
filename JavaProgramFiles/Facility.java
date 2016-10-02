import java.util.Hashtable;

public class Facility{
    public Department dept;
	public String facNo;            //primary key
	public String city;
	public String state;
	public Hashtable<String, Employee> employees = new Hashtable<>();
	
	public Facility(Department dep, String facID, String cty, String stte) {
	    this.dept = dep; this.facNo = facID; this.city = cty; this.state = stte;
		dept.facilities.addElement(this);
	}
	
	public Hashtable<String, Employee> getEmployees() {
		 return employees;
	}
	
	public boolean removeEmployee(String empNo) {
	    if(employees.remove(empNo) != null)
		    return true;
		else
		    return false;	
	}
}