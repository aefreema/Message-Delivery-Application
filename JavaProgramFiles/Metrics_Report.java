public class Metrics_Report extends Report {
	public int perfRating;
	public int teamRating;
	
	public Metrics_Report(Department dep, Employee empl, String repNum, String sum, boolean send, String nme, int perRat, int tmRat) {
	    super(dep, empl, repNum, sum, send, nme);
		this.emp = empl; this.perfRating = perRat; this.teamRating = tmRat;
	}
	
	public String toString() {
	    super.toString();
	    return ("\n" + " " + perfRating + " " + teamRating);
	}
}