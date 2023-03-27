import java.util.StringJoiner;

 
public class StringJoinerEx01 {
	public static void main(String[] args) {
		String str1 = "사과," + "딸기," + "수박," + "사과";
		System.out.println(str1);
		
		String str2 = "사과".concat("딸기").concat("수박").concat("사과");
		System.out.println(str2);
		
		String str3 = String.format("%s,%s,%s,%s", "사과", "딸기", "수박", "사과");
		System.out.println(str3);
		
		String[] arrStr = {"사과", "딸기", "수박", "사과"};
		String str4 = String.join(",", arrStr);
		System.out.println(str4);
		
		StringJoiner sj = new StringJoiner(",");
		sj.add("사과");
		sj.add("딸기");
		sj.add("수박");
		sj.add("참외");
		System.out.println(sj.toString());
	}
}
