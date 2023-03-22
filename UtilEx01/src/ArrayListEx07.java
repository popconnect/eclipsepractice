package UtilEx01.src;

import java.util.ArrayList;

public class ArrayListEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		
		for(int i = 0; i<a1.size(); i++) {
			if(a1.get(i) instanceof Integer) {
				System.out.println(a1.get(i));
				a1.remove(i);
			}
		}
		System.out.println(a1);
	}
}
