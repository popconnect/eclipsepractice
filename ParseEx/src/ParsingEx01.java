import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ParsingEx01 {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		
		
		String line;
		try {
			
			boolean flag1 = false;
			boolean flag2 = false;
			
			URLConnection conn = new URL("https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.xml?key=f5eef3421c602c6cb7ea224104795888&targetDt=20230409").openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			line = br.readLine();
			String list = line.replaceAll("><", ">\n<");
			
			String[] fixlist = list.split("\n");
			for(String e : fixlist) {
				if(e.startsWith("<rank>")) {
					System.out.println(e.trim().replaceAll("<rank>", "").replaceAll("</rank>", ""));
				}
				if(e.contains("</movieNm>")) {
					System.out.println(e.trim().replaceAll("<movieNm>", "").replaceAll("</movieNm>", ""));
				}
			}
			
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

