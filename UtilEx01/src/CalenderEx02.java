import java.util.Calendar;
import java.util.Date;
public class CalenderEx02 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		c.set(2023, 3-1, 1);
		System.out.println(c.getTime());
		
		c.add(Calendar.DATE, 3);
		System.out.println(c.getTime());
		Date date =c.getTime();
		System.out.println(date);
		
		c.add(Calendar.MONTH, -6);
		System.out.println(c.getTime());
		
		
		
	}
	
	public void brabo() {
		
	}
}
