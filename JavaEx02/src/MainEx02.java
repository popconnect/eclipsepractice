import pack.Parent;
import pack.Child;

public class MainEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1 = new Parent();
		Parent p2 = new Parent("홍길동", 60);
		
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		
		Child c1 = new Child();
		c1.viewChild();
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
	}
}
