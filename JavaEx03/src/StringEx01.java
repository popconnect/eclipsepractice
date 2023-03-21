
public class StringEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 저장 클래스
		/** 
		 * StringBuffer / StringBuilder(o)
		 									* */
		String str1 = "Hello String";
		String str2 = new String("HelloString");
		char[] charArray = {'H', 'e', 'l', 'l', 'o'};
		String str3 = new String(charArray);
		System.out.println(str1.length());
		
		//문자열에서 문자 추출
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(str1.length()-1));
		
		//문자열에서 부분 문자열추출(많이사용)
		System.out.println(str1.substring(2, 4));
		
		System.out.println(str1.indexOf('l'));
		System.out.println(str1.lastIndexOf("p"));
		
		//문자열 존재 여부 contains, endswith
		System.out.println(str1.startsWith("He"));
		
		//문자열 치환
		System.out.println(str1.replaceAll("Hello", "안녕"));
		
		//문자열 결합
		System.out.println(str1.concat(" 안녕"));
		
		//대소문자
		System.out.println("hello".toUpperCase());
		System.out.println("HELLO".toLowerCase());
		
		String str11 = "            hello    string   ";
		System.out.println(str11.length());
		//앞뒤공백제거
		String str12 = str11.trim();
		System.out.println(str12.length());
		System.out.println(str12);
		
		//구분자 단위 분리
		String str21 = "apple,banana,pineapple,kiwi";
		String[] strArr = str21.split(",");
		for (String str : strArr) {
			System.out.println(str);
		}
		//결합
		String str22 = String.join(",", strArr);
		System.out.println(str22);
		
		String str31 = String.format("%s-%s-%s", "aaa", "bbb", "ccc");
		System.out.println(str31);
				
		String str41 = "hong gil dong";
		String result = "";
		String result2 = "";
		String[] strArr2 = str41.split(" ");
		for (String str50 : strArr2) {
			result += str50.substring(0, 1).toUpperCase() + str50.substring(1) + ' ';
		}
		System.out.println(result);
		
	}
}
