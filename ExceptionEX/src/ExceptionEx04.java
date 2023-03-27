
import java.util.Random;

public class ExceptionEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = new Random().nextInt(2);
		try {
			System.out.println("Code 1, num: " + num);
			int i = 1/num;
			System.out.println("Code 2 - 예외없음");
		} catch(ArithmeticException e) {
			System.out.println("code 3 - 예외처리 완료");
			
		}
		System.out.println("예외처리완료");
	}

}
