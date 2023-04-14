import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ParsingEx04 {
	public static void main(String[] args) {
		BufferedReader br = null;
		String url = "https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20230409";
		
		
		String line;
		try {
			
			
			URLConnection conn = new URL(url).openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			line = br.readLine();
			line = line.replaceAll(",", "\n");
			String[] Strline = line.split("\n");
			
			System.out.println(line);
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br != null) try {br.close();} catch(IOException e) {};
		}

	}
}

