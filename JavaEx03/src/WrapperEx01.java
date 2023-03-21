import java.util.concurrent.ForkJoinTask;

public class WrapperEx01 {
	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MIN_VALUE);
		//wrapper 클래스
		
		Integer i1 = Integer.valueOf(123);
		Integer i2 = Integer.valueOf("123");
		
		//AutoBoxing
		Integer i3 = 123;
		
		//형변환
		int i11 = i1.intValue();
		float f11 = i1.floatValue();
		
		System.out.println(i11);
		System.out.println(f11);
		
		// 문자열을 정수나 실수로
		int i21 = Integer.parseInt("123");
		float f21 = Float.parseFloat("123");
		System.out.println(i21);
		System.out.println(f21);
	}
}
