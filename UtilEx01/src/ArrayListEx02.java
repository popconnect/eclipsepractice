import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add("홍길동");
		a1.add("박문수");
		a1.add("이몽룡");
		
		System.out.println(a1.toString());
		a1.add(2, "장길산");
		System.out.println(a1.toString());
		a1.set(0, "이몽룡");
		System.out.println(a1.toString());
		a1.remove(0);
		System.out.println(a1.toString());
		a1.clear();
		System.out.println(a1.toString());
		System.out.println(a1.size());
	}

}
