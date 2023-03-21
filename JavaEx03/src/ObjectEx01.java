
public class ObjectEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object o1 = new Object();
		
		//toString() => 맴버필드 출력
		//override
		System.out.println(o1);
		System.out.println(o1.toString());
		
		System.out.println(o1.getClass().getName());
		System.out.println(o1.hashCode());
		System.out.printf("%x", o1.hashCode());
		
		Person p = new Person(100, "홍길동", 20);
		
		System.out.println(p);
		System.out.println(p.toString());
		
		String str = new String("Hello Java");
		System.out.println(str);
		System.out.println(str.toString());
		
		}
	}

