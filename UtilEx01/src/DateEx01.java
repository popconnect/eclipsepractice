import java.util.*;

public class DateEx01 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.toString());
		//System.out.println(d1.getYear());
		String strDate = d1.toLocaleString();
		System.out.println(strDate.substring(0, 4) + "년" + strDate.substring(6, 7) + "월" + strDate.substring(9, 11) + "일");
		System.out.println(d1.getYear()+1900);
		System.out.println(d1.getMonth()+1);
		System.out.println(d1.getDate());
		System.out.println(d1.getDay());
		
		String[] weekname = { "일", "월", "화", "수", "목", "금", "토"};
		System.out.println(weekname[d1.getDay()]);
	}
}
