import java.util.Vector;
import java.util.Hashtable;

public class DHS
{
    public String deptName = "Department of Homeland Security";
	public String deptNo = "DHS";                                 //primary key
	public String headquarters;
	public int numEmp;
	public String executive;
	public Vector<Department> departments = new Vector<>(15);
	public Hashtable<String, Alert> alerts = new Hashtable<>();
	
	public DHS(String HQ, int EmpNum, String Boss) {
	    this.headquarters = HQ;
		this.numEmp = EmpNum;
		this.executive = Boss;
	}
	
	public void receiveAlert(Alert alrt) {
	    for (int i = 0; i < alrt.sendTo.length; i++) {
		    if (alrt.sendTo[i] == true) 
			    sendAlert(i , alrt);
		}
	}
	
	public void sendAlert(int index, Alert alrt) {
		    departments.elementAt(index).alerts.put(alrt.alertNo, alrt);
	}
	
	public Report transferReport(String alertNo) {
	   Report rpt = null;
	   rpt = alerts.get(alertNo).rept;
	   return rpt;
	}
	
	public boolean removeAlert(String alertNo) {
	    Department fromDep = alerts.get(alertNo).dept;
	    alerts.remove(alertNo);
		fromDep.removeAlert(alertNo);
		return true;
	}
}