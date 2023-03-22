package UtilEx01.src;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

class TreeSetLotto {
	Integer bonus;
	Set<Integer> lotto = new TreeSet<>();

	public void setup() {
		Random random = new Random();
		while (bonus == null) {
			int num = random.nextInt(45) + 1;
			if (lotto.size() < 6) {
				lotto.add(num);
			} else {
				bonus = num;
			}
		}
	}

	@Override
	public String toString() {
		return "당첨번호: " + lotto + ", 보너스: " + bonus;
	}
}

public class Lottoduciplex {

	public static void main(String[] args) {
		TreeSetLotto lotto = new TreeSetLotto();
		lotto.setup();
		System.out.println(lotto);
	}
}