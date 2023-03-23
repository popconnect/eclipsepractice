import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormetEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat fm1 = new DecimalFormat("$#,###.#");
		double db1Num1 = 1234.5;
		double db1Num2 = 1234.56323;
		double db1Num3 = 234.5;
		
		String strNum1 = fm1.format(db1Num1);
		String strNum2 = fm1.format(db1Num2);
		String strNum3 = fm1.format(db1Num3);
		
		System.out.println(strNum1);
		System.out.println(strNum2);
		System.out.println(strNum3);
		
		
		String strNum4 = "$1,234.5";
		try {
			double paserNum = (double)fm1.parse(strNum4);
			System.out.println(paserNum);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
