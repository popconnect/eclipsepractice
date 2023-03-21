import java.util.*;
public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		Date d2 = new Date(1500000000000L);
		System.out.println(d1);
		System.out.println(d2);
		
		long gap = d1.getTime() - d2.getTime();
		System.out.println("두 날자의 차는 " + (gap/1000/60/60/24) + "일이다.");
	}

}
