import java.util.StringTokenizer;

public class StringTokenizerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strData1 = "사과 참외 수박 딸기";
		StringTokenizer st1 = new StringTokenizer(strData1);
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		String str2Data = "사과&참외&수박&딸기";
		StringTokenizer st2 = new StringTokenizer(str2Data, "&");
		
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		
		String Str3Data = "x=100*(200+300)/2";
		StringTokenizer st3 = new StringTokenizer(Str3Data, "+-*/=()");
		
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken());
		}
		/*
		 * System.out.println(st1.countTokens()); System.out.println(st1.nextToken());
		 * System.out.println(st1.nextToken()); System.out.println(st1.nextToken());
		 * System.out.println(st1.nextToken()); System.out.println(st1.nextToken());
		 */
		
		
	}

}
