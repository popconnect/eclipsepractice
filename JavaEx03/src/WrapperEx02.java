
public class WrapperEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i11 = 10;
		int i12 = 20;
		int sum = i11 + i12;
		System.out.println(sum);
		
		//wrapper 클래스 - 기본자료형처럼 사용가능
		Integer i21 = Integer.valueOf("10");
		Integer i22 = Integer.valueOf("20");
		//unboxing 계산을 위해 기본자료형으로 변함
		float sum2 = i21 + i22;
		System.out.println(sum2);
	}
}
