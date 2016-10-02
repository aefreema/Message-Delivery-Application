import java.util.Date;

public class Alert implements Comparable<Alert>{
    public DHS deptHS;
	public Department dept;
	public Date date;
	public String alertNo;                          //primary key
	public boolean[] sendTo = new boolean[15];      //boolean array representing departments to send Alert to
	public Report rept;
	public String alertType;

	public Alert(String num, Report rep, String alType, boolean[] sending) {
	    this.deptHS = rep.dept.deptHS; this.dept = rep.dept; this.rept = rep; this.alertType = alType;
		this.alertNo = num;
		
		for (int i = 0; i < sending.length; i++) {
		    if (sending[i] == true)
			    this.sendTo[i] = true;
			else
			    this.sendTo[i] = false;
		};
		deptHS.alerts.put(alertNo, this);
		dept.alerts.put(alertNo, this);
		rept.alrt = this;
		date = new Date();
	}
	
	public int compareTo(Alert other) {
	    return this.date.compareTo(other.date);
	}
	
	public String toString() {
	    return (alertNo + " " + dept.deptNo + " " + rept.repNo + " " + alertType);
	}
}