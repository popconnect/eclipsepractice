package pack1;

public class OuterMain {
	public static void main(String[] args) {
		Outer outer = new Outer();
		
		//System.out.println(outer.x1);
		System.out.println(outer.x2);
		
		Outer.Inner inner =  outer.new Inner();
		//System.out.println(inner.y1);
		System.out.println(inner.y2);
		
		inner.viewInner();
		
	}
}
