package UtilEx01.src;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	Set<Object> hset = new HashSet<Object>();

	private void addMethod() {
		this.hset.add(Integer.valueOf(1));
		this.hset.add("Hello");
		this.hset.add("Hello");
		this.hset.add(null);
		this.hset.add(1);
		this.hset.add(new Phone("010-000-1234"));
		this.hset.add(new Phone("010-000-1234"));
		System.out.println("데이터 추가 결과: " + this.hset);
	}

	private void retrieveMethod() {
		System.out.println("데이터 개수: " + this.hset.size());

		for (Object sobj : this.hset) {
			System.out.println("데이터 조회: " + sobj);
		}
	}

	private void removeMethod() {
		this.hset.remove("Hello");
		System.out.println("데이터 삭제 결과: " + this.hset);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSetTest hst = new HashSetTest();
		hst.addMethod();
		hst.retrieveMethod();
		hst.removeMethod();
	}

}
