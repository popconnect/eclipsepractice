package pack;

public class Util {
	
	private int startdan;
	private int enddan;
	
	
	public Util() {
	}


	public Util(int startdan, int enddan) {
		this.startdan = startdan;
		this.enddan = enddan;
		for(int i=startdan; i<=enddan; i++) {
			for(int j=1; j<=9; j++) {				
				System.out.println(i +"x"+ j + "=" + i*j);
			}
		}
	}

	public int getStartdan() {
		return startdan;
	}

	public int getEnddan() {
		return enddan;
	}
}
	
	


