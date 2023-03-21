
public class ObjectEx02 {
	public static void main(String[] args) {
		int a1 = 10;
		int a2 = 10;
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		//데이터값 비교 결과 true
		System.out.println(a1 == a2);
		
		//주소값 비교 결과 false
		System.out.println(o1 == o2);
		
		String str1 = new String("박문수");
		String str2 = new String("박문수");
		
		System.out.println(str1 == str2);
		
		//필드값 필드값
		System.out.println(o1.equals(o2));
		System.out.println(str1.equals(str2));
		
	}
}
