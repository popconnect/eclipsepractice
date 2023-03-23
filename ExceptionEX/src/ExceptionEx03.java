public class ExceptionEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		//int num1 = 10;
		int num1 = 0;
		int num2 = 20;
		try {
			int result = num2 / num1;
			System.out.println(result);
		} catch(ArithmeticException e)  {
			System.out.println("에러발생");
			System.out.println("o으로 나눌수 없습니다");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("끝");
	}
		
}