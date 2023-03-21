import pack1.Student2;

public class MainEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Eclipse");
		System.out.println("Hello Eclipse");
		
		Student1 stu1 = new Student1();
		stu1.hakbun = "1001";
		stu1.name = "홍길동";
		
		System.out.println(stu1.hakbun);
		System.out.println(stu1.name);
		
		//Student1 stu2 = new Student1();
		//stu2.hakbun = "1002";
		//stu2.name = "박문수";
		//System.out.println(stu2.hakbun);
		//System.out.println(stu2.name);
		
		Student2 stu2 = new Student2();
		stu2.hakbun = "1001";
		stu2.name = "홍길동";
		
		System.out.println(stu1.hakbun);
		System.out.println(stu1.name);
	}
}
