package UtilEx01.src;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx01 {
	
	public static void main(String[] args) {
		
		HashSet<String> hs1 = new HashSet<>() ;
		Set<String> hs2 = new HashSet<>();
		hs1.add( "홍길동" );
		hs1.add( "박문수" );
		hs1.add( "장길산" );
		
		System.out.println(hs1);
		System.out.println(hs1.size());
		
		hs1.add( "홍길동" );
		hs1.add( "장길산" );
		
		System.out.println(hs1);
		
		Iterator<String> i = hs1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(String s : hs1) {
			System.out.println(s);
		}
	}
}
