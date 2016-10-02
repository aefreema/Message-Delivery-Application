public class Intelligence_Report extends Report {
    public int alertLvl;
	public String intType;
	public String location;
	public int dangerLvl;
	public String description;
	
	public Intelligence_Report(Department dep, Employee empl, String repNum, String sum, boolean send, String nme, int alLvl, String type, String loc, int lvl, String dec) {
	    super(dep, empl, repNum, sum, send, nme);
		this.alertLvl = alLvl; this.intType = type; this.location = loc; this.dangerLvl = lvl; this.description = dec;
	}
	
	public String toString() {
	    super.toString();
	    return ("\n" + alertLvl + " " + intType + " " + dangerLvl + " " + description);
	}
}