import java.awt.*;

public abstract class DomainLogic {
    protected TextArea textArea1;
    protected static Employee employee = null;
	
	public DomainLogic() {}
	
    protected int toInt(String s) {
	    Integer i = new Integer(s);
		try{
		} catch(Exception e) {return 0;}
		return i.intValue();
	}
}