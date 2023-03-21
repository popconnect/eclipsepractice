import java.util.ArrayList;
public class ArrayListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List 계열의 컬랙션 프레임워크
		
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList(100);
		
		//String 이 오브젝트로 형변환
		al1.add("홍길동");
		al1.add("박문수");
		al1.add("이몽룡");
		
		System.out.println(al1);
		System.out.println(al1.size());
		String data1 = (String)al1.get(0);
		String data2 = (String)al1.get(1);
		/*
		 * System.out.println(data1); System.out.println(data2);
		 */
		
		for(int i=0; i<al1.size(); i++) {
			System.out.println((String)al1.get(i));
		}
	}

}
