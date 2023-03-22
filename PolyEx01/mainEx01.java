package PolyEx01;

public class mainEx01 {
	public static void main(String[] args) {
		
		// TODO Auto-generated constructor stub
		Person p1 = new Employee1();
		Person p2 = new Employee2();
		
		p1.salary();
		p2.salary();
		
		System.out.println( p1 instanceof Person);
		System.out.println( p1 instanceof Employee1);
		System.out.println( p1 instanceof Employee2);
		System.out.println( p1 instanceof Object);
	}
	
}

	
