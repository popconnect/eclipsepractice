
public class WalkTestBad {
	void walk() {
		System.out.println("100cm이동");
	}
	
	void walk(int distance) {
		System.err.println(distance + "cm이동");
	}
	
	void walk(int distance, String unit) {
		switch (unit) {
		case "cm":
			break;
		case "inch":
			distance *= 2.54;
			break;

		default:
			System.out.println("unknown");
			distance =0;
		}
		System.out.println(distance + " cm이동");
	}
	
	public static void main(String[] args) {
		WalkTestBad wtb = new WalkTestBad();
		wtb.walk();// 100이동
		wtb.walk(100);
		wtb.walk();
	}

}
