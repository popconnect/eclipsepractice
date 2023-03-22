package iron;

public interface Fightable {
	
	int fire();

	
}

interface Transformable{
	void changShape(boolean isHeroMode);
}

public interface Heroable extends Fightable , Transformable{
	void upgrade();
}