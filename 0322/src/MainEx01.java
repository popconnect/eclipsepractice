

public class MainEx01 {
	
	public static void main(String[] args) {
		Person p1 = new Employee1();
		Person p2 = new Employee2();
		
		// 다형성
		// Person salary no    - Employee salary ok 
		p1.salary();
		p2.salary();
			
		System.out.println(p1 instanceof Person);
		System.out.println(p1 instanceof Employee1);
		System.out.println(p1 instanceof Employee2);
		System.out.println(p1 instanceof Object);
	}

}
