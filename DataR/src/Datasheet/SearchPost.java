package Datasheet;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchPost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("Java 클래스명 동이름 형식으로 입력하셔야합니다.");
			System.exit(0);
		}
		
		if(args[0].length() < 2 ) {
			System.out.println("동이름을 두 자 이상 입력하셔야합니다.");
		}

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Java\\java-eclipse-workspace\\DataR\\src\\Datasheet\\zipcode_seoul_utf8_type2.csv"));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				String[] values= line.split(",");
				if(values[2].equals("강남구")) {
					
				}
				/*
				 * for(String v : values) { if(v.equals(args)) { System.out.println(line); }
				 * 
				 * }
				 */
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br != null) try { br.close();} catch(IOException e) {}
		}
		
 	}

}
