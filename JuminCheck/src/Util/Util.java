package Util;

public class Util {
	private String [] jumin;
	private int [] CRC = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
	private String result;
	private boolean tof;
	
	public void setJumin(String[] jumin) {
		this.jumin = jumin;
	}



	public boolean checkJumin() {
		String strJumin = this.jumin[0].replace("-", "");
		
		int sum = 0;
		
		for ( int i=0; i<this.CRC.length; i++) {
			sum += Integer.parseInt(strJumin.substring(i, i+1))* CRC[i];
		}
		
			int lastNum = Integer.parseInt(strJumin.substring(12,13));
			int resultNum = (11 - (sum % 11) % 10);
		
		if (lastNum == resultNum) {
			tof = true;
		} else {
			tof = false;
		}
		return this.tof;
		}



	public boolean isTof() {
		return tof;
	}
	
	
	
	
		
		
}
