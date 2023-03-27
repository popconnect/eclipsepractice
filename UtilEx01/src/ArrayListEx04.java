import java.util.ArrayList;

public class ArrayListEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al1 = new ArrayList();
		al1.add("홍길동");
		al1.add(new Person("1001", "홍길동"));
		
		/*
		 * for(int i=0; i<al1.size(); i++) { String s = (String)al1.get(i);
		 * System.out.println(s); }
		 */
		//<Generic> 컬랙션 내부의 자료형 변환 
		ArrayList<String> al2 = new ArrayList<>();
		al2.add("홍길동");
		
		for (int i = 0; i<al2.size(); i++) {
			String s = al2.get(i);
			System.out.println(s);
		}
		
	}

}
