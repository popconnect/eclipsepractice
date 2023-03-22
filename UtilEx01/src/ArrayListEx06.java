package UtilEx01.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("홍길동");
		a1.add("박문수");
		a1.add("이몽룡");
		
		System.out.println(a1);
		a1.remove(0);
		System.out.println(a1);
		
		Vector<String> v = new Vector<>();
		v.add("홍길동");
		v.add("박문수");
		v.add("이몽룡");
		
		System.out.println(v);
		v.remove(0);
		System.out.println(v);
		
		//다형/추상의 원리
		List<String> l1 = new ArrayList<>();
		l1.add("홍길동");
		l1.add("박문수");
		l1.add("이몽룡");
		
		System.out.println(l1);
		
		List<String> l2 = new Vector<>();
		l2.add("홍길동");
		l2.add("박문수");
		l2.add("이몽룡");
		
		System.out.println(l2);
		
		
	}

}
