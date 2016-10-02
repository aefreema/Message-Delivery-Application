public class Threat_Report extends Report {
	public String threatType;
	public String threatSource; 
	public String location;
	public String borderRegion;
	public int severityLvl;
	public String description;
	
	public Threat_Report(Department dep, Employee emp, String repNum, String sum, boolean send, String nme, String thrt, String source, String loc, String reg, int level, String desc) {
	    super(dep, emp, repNum, sum, send, nme);
		this.threatType = thrt; this.threatSource = source; this.location = loc; this.borderRegion = reg; this.severityLvl = level; this.description = desc;
	}
	
	public String toString() {
	    super.toString();
	    return ("\n" + " " + threatType + " " + threatSource + " " + location + " " + borderRegion + " " + severityLvl + " " + description);
	}
}