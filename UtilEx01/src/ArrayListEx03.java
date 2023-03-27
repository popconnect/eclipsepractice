import java.util.ArrayList;

public class ArrayListEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		
		Person p1 = new Person("1001", "홍길동");
		Person p2 = new Person("1001", "박문수");
		
		a1.add(p1);
		a1.add(p2);
		
		for (int i=0 ; i<a1.size(); i++) {
			Person p = (Person)a1.get(i);
			System.out.println(p.getHakbun());
			System.out.println(p.getName());
		}
	}

}
