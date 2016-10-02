import java.util.Vector;
import java.util.Hashtable;

public class Department {
    public DHS deptHS;                //primary key
	public String headquarters;
	public String deptNo;
	public String mngDept;
	public String dpmtName;
	public Vector<Facility> facilities = new Vector<>();
	public Vector<AnnualBudget> budgets = new Vector<>();
	public Hashtable<String, Employee> employees = new Hashtable<>();
	public Hashtable<String, Alert> alerts = new Hashtable<>();
	public Hashtable<String, Report> reports = new Hashtable<>();
	
	public Department(DHS depHS, String HQ, String DEP_ID, String mngDep, String depName) {
	    this.deptHS = depHS; this.headquarters = HQ; this.deptNo = DEP_ID; this.mngDept = mngDep;
		this.dpmtName = depName;
		deptHS.departments.addElement(this);
	}
	
	public Hashtable<String, Employee> getEmployees() {
		return employees;
	}
	
	public Employee getEmployee(String empNo) {
	    return employees.get(empNo);
	}
	
	public boolean removeEmployee(String empNo) {
	    employees.remove(empNo);
		return true;
	}
	
	public void sendAlert(Alert alrt) {
	    deptHS.receiveAlert(alrt);
	}
	
	public boolean removeAlert(String alrtNo) {
	    alerts.remove(alrtNo);
		return true;
	}
	
	public Report getReport(String repNo) {
	    return reports.get(repNo);
	}
}