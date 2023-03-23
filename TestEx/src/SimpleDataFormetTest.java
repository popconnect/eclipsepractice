import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.text.ParseException;

public class SimpleDataFormetTest {
	
	public static void main(String[] args) {
		
		String source = "2022년 12월 25일";
		System.out.println(source + "를 요일 정보까지 출력하려면?");
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		try {
			Date parsed = format.parse(source);
			format.applyPattern("yyyy년 MM월 dd일(E)");
			System.out.println(format.format(parsed));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러발생] : " + e.getMessage());
		}
	}
}
