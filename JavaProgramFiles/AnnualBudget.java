public class AnnualBudget {
    public Department dept;
	public int year;           //primary key
	public double annBud;
	public double totRev;
	public double totExp;
	public double totLib;
	
	public AnnualBudget(Department dep, int yr, double bud, double rev, double exp, double lib) {
	    this.dept = dep; this.year = yr; this.annBud = bud; this.totRev = rev; this.totExp = exp;
		this.totLib = lib;
		
		dept.budgets.addElement(this);
	}
	
	public double getBudget() {
	    return annBud;
	}
	
	public double getRevenue() {
	    return totRev;
	}
	
	public boolean addRevenue(double rev) {
	    totRev += rev;
		return true;
	}
	
	public double getExpenses() {
	    return totExp;
	}
	
	public boolean addExpenses(double exp) {
	    totExp += exp;
		return true;
	}
}
