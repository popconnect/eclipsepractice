package iron;

public class IronMan implements Heroable{
	int weaponDamage = 100;
	
	@Override
	public int fire() {
		System.out.printf("빔 발사 %d 데미지%n");
		return this.weaponDamage;
	}

	@Override
	public void changShape(boolean isHeroMode) {
		// TODO Auto-generated method stub
		if(isHeroMode) {
			System.out.println("장갑");
		}else {
			System.out.println("제거");
		}
	}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub
		int before = weaponDamage;
		weaponDamage += weaponDamage * 0.1;
		System.out.printf("성능개선%d ==? %d%n",before,weaponDamage);
		
		
	}

}
