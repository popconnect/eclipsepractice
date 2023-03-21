import java.util.*;
public class DateEx02 {
	public static void main(String[] args) {
		Date d1 = new Date(2023-1900, 3-1, 1);
		System.out.println(d1.toLocaleString());
		Date d2 = new Date(2023-1900, 12-1, 24);
		String[] weekname = { "일", "월", "화", "수", "목", "금", "토"};
		System.out.println(d2.toLocaleString() +" "+ weekname[d2.getDay()] + "요일");
	}
}
