import java.util.Date;

public abstract class Report implements Comparable<Report>{
    public Department dept;
	public Employee emp;
	public Date date;
	public String repNo;            //primary key
	public Alert alrt;
	public String summary;
	public String name;
	public boolean alert;
	
	public Report(Department dep, Employee empl, String repNum, String sum, boolean send, String nme) {
	    this.dept = dep; this.emp = empl; this.repNo = repNum; this.summary = sum; this.alert = send; this.name = nme;
			
		dep.reports.put(repNo, this);
		emp.reports.put(repNo, this);
	}
	
	public int compareTo(Report other) {
	    return this.date.compareTo(other.date);
	}
	
	public String toString() {
	    String report = repNo + " " + dept.deptNo + " ";
		if (alrt != null)
		    report = report + alrt.alertNo + " ";
		report = report + summary;
		return report;
	}
}