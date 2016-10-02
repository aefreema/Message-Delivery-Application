import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Set;
import java.awt.*;
import javax.swing.*;

public class AlertGenerator extends DomainLogic {
    public AlertGenerator() {
	    super();
	}
	
	public void doNewAlert(Report rpt, String altNo, boolean[] sending, String type) {
	    employee.dept.sendAlert(new Alert(altNo, rpt, type, sending));
	} 
	
	public String getAlertNo(JButton b) {
	    String text = b.getText();
		int ind = text.indexOf(" ");
		String alertNo = text.substring(0, ind);
		
		return alertNo;
	}
	
	public PriorityQueue<Alert> maxAlert() {
	    PriorityQueue<Alert> heapAlts = new PriorityQueue<>();
	    Set<String> set = employee.dept.alerts.keySet();
        Iterator<String> it = set.iterator();
	    while (it.hasNext()) {
		    heapAlts.add(employee.dept.alerts.get(it.next()));
		}
		
		return heapAlts;
	}

	public boolean displayAlerts(PriorityQueue<Alert> pq, JButton b0, JButton b1, JButton b2, JButton b3, JButton b4) {
		
		if (pq.peek() != null) {
		    Alert a0 = pq.poll();
		    b0.setText(a0.alertNo +  "       " + a0.rept.summary);
			b0.setVisible(true);
		}
		if (pq.peek() != null) {
		    Alert a1 = pq.poll();
		    b1.setText(a1.alertNo +  "       " + a1.rept.summary);
			b1.setVisible(true);
		}
		if (pq.peek() != null) {
		    Alert a2 = pq.poll();
		    b2.setText(a2.alertNo +  "       " + a2.rept.summary);
			b2.setVisible(true);
		}		
		if (pq.peek() != null) {
		    Alert a3 = pq.poll();
		    b3.setText(a3.alertNo +  "       " + a3.rept.summary);
			b3.setVisible(true);
		}	
		return true;
	}
}