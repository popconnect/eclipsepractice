
public class Person {

	private String hakbun;
	private String name;
	
	public Person(String hakbun, String name) {
		this.hakbun = hakbun;
		this.name = name;
	}
	public String getHakbun() {
		return hakbun;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return "Person [hakbun=" + hakbun + "Name [Name=" + name + "]" ;
	
	}

}
