import java.util.Calendar;
public class CalenderEx01 {
	public static void main(String[] args) {
		Calendar calender = Calendar.getInstance();
		System.out.println(calender.toString());
		System.out.println(calender.get(calender.YEAR));
		System.out.println(calender.get(calender.MONTH) + 1);
		System.out.println(calender.get(calender.DATE));
		//일요일 = 1
		System.out.println(calender.get(calender.DAY_OF_WEEK));
		
		System.out.println(calender.getTime());
		System.out.println(calender.getTimeInMillis());
		
		System.out.println(calender.getActualMaximum(calender.DATE));
	}
}
