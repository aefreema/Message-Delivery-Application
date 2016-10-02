import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Set;
import java.awt.*;
import javax.swing.*;

public class ReportGenerator extends DomainLogic {
    public static int num = 0;
    public static String repNo = "R" + num;

    public ReportGenerator() {
	    super();
	}
	
	public void nextRepNo() {
	    repNo = "R" + (num++);
	}
	
/*	public Intelligence_Report doNewIntelligence_Report(String sum, boolean send, String nme, String altLvl, String type, String loc, String level, String dec, JButton b) {
	    //use for editing reports
	    if (employee.dept.reports.get(repNum) != null) {
		    String repNum = employee.dept.reports.get(repNum).repNo;
		    employee.dept.reports.remove(repNum);
		}
		else {
		    String repNum = repNo;
			nextRepNo();
		}
			
	    int alLvl = toInt(altLvl);
	    int lvl = toInt(level);
		b.setText(repNum + "       " + sum);
		b.setVisible(true);
	    return new Intelligence_Report(employee.dept, employee, repNum, sum, send, nme, alLvl, type, loc, lvl, dec);
        
	}
	public Threat_Report doNewThreat_Report(String sum, boolean send, String nme, String thrt, String source, String loc, String reg, String lvl, String desc, JButton b) {
	    //use for editing reports
	    if (employee.dept.reports.get(repNum) != null) {
		    String repNum = employee.dept.reports.get(repNum).repNo;
		    employee.dept.reports.remove(repNum);
		}
		else {
		    String repNum = repNo;
			nextRepNo();
		}
	
		int level = toInt(lvl);
		b.setText(repNum + "       " + sum);
		b.setVisible(true);
	    return new Threat_Report(employee.dept, employee, repNum, sum, send, nme, thrt, source, loc, reg, level, desc); 
	}
	public Metrics_Report doNewMetrics_Report(String sum, boolean send, String nme, String perfRat, String teamRat, JButton b) {
	    //use for editing reports
	    if (employee.dept.reports.get(repNum) != null) {
		    String repNum = employee.dept.reports.get(repNum).repNo;
		    employee.dept.reports.remove(repNum);
		}
		else {
		    String repNum = repNo;
			nextRepNo();
		}
			
	    int perRat = toInt(perfRat);
		int tmRat = toInt(teamRat);
		b.setText(repNum + "       " + sum);
		b.setVisible(true);
	    return new Metrics_Report(employee.dept, employee, repNum, sum, send, nme, perRat, tmRat);
	}*/
	
	public void setReportButton(String rNum, JButton b) {
		Report rpt = employee.dept.reports.get(rNum);
		b.setText(rpt.repNo + "       " +rpt.summary);
		b.setVisible(true);
	}
	
	public Report getReportNo(JButton b) {
	    String text = b.getText();
		int ind = text.indexOf(" ");
		String repNo = text.substring(0, ind);
		Report rpt = employee.dept.reports.get(repNo);
		return rpt;
	}
	
	// need one for each report type
	public void editIntelligence_Report(String repNo, TextField repNum, TextField sum, JCheckBox send, TextField nme, TextField altLvl, TextField type, TextField loc, TextField level, TextField dec) {
	    Intelligence_Report rpt = (Intelligence_Report) employee.dept.reports.get(repNo);
		repNum.setText(rpt.repNo);
		sum.setText(rpt.summary);
		send.setSelected(rpt.alert);
		nme.setText(rpt.name);
		altLvl.setText(rpt.alertLvl + "");
		type.setText(rpt.intType);
		loc.setText(rpt.location);
		level.setText(rpt.dangerLvl + "");
		dec.setText(rpt.description);
	}
	public void editThreat_Report(String repNo, TextField repNum, TextField sum, JCheckBox send, TextField nme, TextField thrt, TextField source, TextField loc, TextField reg, TextField lvl, TextField desc) {
	    Threat_Report rpt = (Threat_Report) employee.dept.reports.get(repNo);
		repNum.setText(rpt.repNo);
		sum.setText(rpt.summary);
		send.setSelected(rpt.alert);
		nme.setText(rpt.name);
		thrt.setText(rpt.threatType);
		source.setText(rpt.threatSource);
		loc.setText(rpt.location);
		reg.setText(rpt.borderRegion);
		lvl.setText(rpt.severityLvl + "");
		desc.setText(rpt.description);
	}
	public void editMetrics_Report(String repNo, TextField repNum, TextField sum, JCheckBox send, TextField nme, TextField perfRat, TextField teamRat) {
	    Metrics_Report rpt = (Metrics_Report) employee.dept.reports.get(repNo);
		repNum.setText(rpt.repNo);
		sum.setText(rpt.summary);
		send.setSelected(rpt.alert);
		nme.setText(rpt.name);
		perfRat.setText(rpt.perfRating + "");
		teamRat.setText(rpt.teamRating + "");
	}
	
	public void doIntelligence_Report(Intelligence_Report rpt, JTextArea repNumber) {
	    repNumber.setText(rpt.repNo + "");
	    textArea1.setText(rpt.dept.deptNo + " Intelligence Report\n\n");
		textArea1.append("Report No: " + rpt.repNo + "\n");
		textArea1.append("Intelligence Type: " + rpt.intType + "\n");
		textArea1.append("Name: " + rpt.name + "\n");
		textArea1.append("Location: " + rpt.location + "\n");
		textArea1.append("Danger Level: " + rpt.dangerLvl + "\n");
		textArea1.append("Alert Level: " + rpt.alertLvl + "\n");
		if (rpt.alert)
		    textArea1.append("Alert No: " + rpt.alrt.alertNo + "\n");
		textArea1.append("Description:\n" + rpt.description);
	}
	
	public void doThreat_Report(Threat_Report rpt, JTextArea repNumber) {
	    repNumber.setText(rpt.repNo + "");
        textArea1.setText(rpt.dept.deptNo + " Threat Report\n\n");  
		textArea1.append("Report No: " + rpt.repNo + "\n");
		textArea1.append("Threat Type: " + rpt.threatType + "\n");
		textArea1.append("Threat Source: " + rpt.threatSource + "\n");
		textArea1.append("Name: " + rpt.name + "\n");
		textArea1.append("Location: " + rpt.location + "\n");
		textArea1.append("Border Region: " + rpt.borderRegion + "\n");
		textArea1.append("Severity Level: " + rpt.severityLvl + "\n\n");
		if (rpt.alert)
		    textArea1.append("Alert No: " + rpt.alrt.alertNo + "\n");
		textArea1.append("Description:\n" + rpt.description);
	}
	public void doMetrics_Report(Metrics_Report rpt, JTextArea repNumber) {
	    repNumber.setText(rpt.repNo+ "");
        textArea1.setText(rpt.dept.deptNo + " Metrics Report\n\n");
		textArea1.append("Report No: " + rpt.repNo + "\n");
		textArea1.append("Name: " + rpt.name + "\n");
		textArea1.append("Performance Rating: " + rpt.perfRating + "\n");
		textArea1.append("Teamwork Rating: " + rpt.teamRating);
	}
	
	//used when opening report from Alert
	public Report getReport(String altNo) {
	    return employee.dept.deptHS.transferReport(altNo);
	}
	
	public PriorityQueue<Report> maxReport() {
	    PriorityQueue<Report> heapReps = new PriorityQueue<>(employee.dept.reports.size());
	    Set<String> set = employee.dept.reports.keySet();
        Iterator<String> it = set.iterator();
	    while (it.hasNext()) {
		    heapReps.add(employee.dept.reports.get(it.next()));
		}
		return heapReps;
	}
	
	public boolean displayReports(PriorityQueue<Report> pq, JButton b0, JButton b1, JButton b2, JButton b3, JButton b4) {
		
		if (pq.peek() != null) {
		    Report r0 = pq.poll();
		    b0.setText(r0.repNo +  "       " + r0.summary);
			b0.setVisible(true);
		}
		if (pq.peek() != null) {
		    Report r1 = pq.poll();
		    b0.setText(r1.repNo +  "       " + r1.summary);
			b0.setVisible(true);
		}
		if (pq.peek() != null) {
		    Report r2 = pq.poll();
		    b0.setText(r2.repNo +  "       " + r2.summary);
			b0.setVisible(true);
		}	
		if (pq.peek() != null) {
		    Report r3 = pq.poll();
		    b0.setText(r3.repNo +  "       " + r3.summary);
			b0.setVisible(true);
		}
		if (pq.peek() != null) {
		    Report r4 = pq.poll();
		    b0.setText(r4.repNo +  "       " + r4.summary);
			b0.setVisible(true);
		}		
		return true;
	}
}