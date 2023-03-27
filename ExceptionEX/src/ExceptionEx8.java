import java.nio.file.spi.FileSystemProvider;

public class ExceptionEx8 {

	
	public void method2(int num) throws Exception {
		System.out.println("메서드 시작");
		if (num >= 100) {
			System.out.println("100보다 크다");
		} else {
			throw new Exception("100보다 작다");
		}
		System.out.println("메서드 끝");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionEx8 ee = new ExceptionEx8();
		 
		try {
			ee.method2(10);
		} catch (Exception e) {
			System.out.println("에러 : " + e.getMessage());
		}
		
		
		
	}

}
