import java.awt.*;
import javax.swing.*;

public class AccountManagement extends DomainLogic {
    public AccountManagement() {
	    super();
	}
	
	public Employee doLogin(String id, String passGiven, TextField employeeNameLabel, TextField deptNameLabel) {
		if (!((id.equals("") || passGiven.equals("")))) {
		    employee = (Employee) Employee.employees.get(id);
			if (employee != null) {
    		    if (employee.password.equals(passGiven)) {
	    		    employeeNameLabel.setText(employee.fName + " " + employee.lName);
		    		deptNameLabel.setText(employee.dept.dpmtName + "");
				}
			}
		}
		return employee;
	}
	
	public void logout() {
	    employee = null;
	}
	
	public void findEmployee(TextField empNo, TextField facilNum, TextField fstName, TextField lstName, TextField empNumb, TextField empTitle, TextField deptName, TextField deptNum) {
		String empNum = empNo.getText();
		empNum.trim();
		Employee emp = Employee.employees.get(empNum);
		if (emp != null) { 
		    facilNum.setText(emp.fclty.facNo);
			fstName.setText(emp.fName);
			lstName.setText(emp.lName);
			empNumb.setText(emp.empNum);
			empTitle.setText(emp.jobTitle);
			deptName.setText(emp.dept.dpmtName);
			deptNum.setText(emp.dept.deptNo);
		}
	} 
}