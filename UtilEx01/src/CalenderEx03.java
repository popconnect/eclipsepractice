import java.util.Calendar;
public class CalenderEx03 {
	public static void main(String[] args) {
		int year = 2023;
		int month = 4;
		
		Calendar startCalender = Calendar.getInstance();
		Calendar endCalender = Calendar.getInstance();
		
		startCalender.set(year, month-1, 1);
		endCalender.set(year, month, 1-1);
		
		int startDayOfweek = startCalender.get(Calendar.DAY_OF_WEEK);
		int endDate = endCalender.get(Calendar.DATE);
		
		System.out.println(" SU MO TU WE TH FR SA");
		for(int i=1; i<startDayOfweek; i++) {
			System.out.print("   ");
		}
		for(int i=1, n=startDayOfweek; i<=endDate; i++, n++) {
			System.out.print((i<10) ? "  " + i : " " + i);
			if (n % 7 == 0) {
				System.out.println();
			}
		}
	}
}
