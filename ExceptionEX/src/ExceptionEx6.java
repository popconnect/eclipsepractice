import java.nio.file.spi.FileSystemProvider;

public class ExceptionEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		String name = null;
		int num1 = 0;
		int num2 = 10;
		try {
			System.out.println(name.length());
			System.out.println(num2 / num1);
		/*} catch(NullPointerException e) {
			System.out.println("객체 생성후 메서드 사용");
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		}*/
		} catch(Exception e) {
			System.out.println("에러" + e.getMessage());
		}
		
		
		System.out.println("끝");
	}

}
