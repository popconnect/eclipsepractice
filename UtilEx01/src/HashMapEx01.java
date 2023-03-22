package UtilEx01.src;
import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String , String> hm = new HashMap<>();
		
		hm.put("a", "홍길동");
		hm.put("b", "박문수");
		hm.put("c", "이몽룡");
		
		System.out.println(hm);
		System.out.println(hm.size());
		hm.put("d", "장길산");
		System.out.println(hm);
		//키가 없으면 추가 키가 있으면 수정
		hm.put("c", "임꺽정");
		System.out.println(hm);
		
		
		System.out.println(hm.get("a"));
		System.out.println(hm.get("b"));
		
		hm.remove("c");
		System.out.println(hm);
		hm.clear();
		System.out.println(hm);
	}

}
