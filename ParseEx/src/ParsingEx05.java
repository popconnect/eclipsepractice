import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONAware;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ParsingEx05 {
	public static void main(String[] args) {
		BufferedReader br = null;
		String url = "https://kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchWeeklyBoxOfficeList.json?key=f5eef3421c602c6cb7ea224104795888&targetDt=20230409";
		
		//rank movied movieNm
		JSONParser parser = new JSONParser();
		try {
			
			URLConnection conn = new URL(url).openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line = br.readLine();
			
			JSONObject obj = (JSONObject)parser.parse(line);
			JSONObject wek = (JSONObject)obj.get("boxOfficeResult");
			JSONArray fin = (JSONArray)wek.get("weeklyBoxOfficeList");
		    
			for(int i=0; i<fin.size(); i++) {
				JSONObject object = (JSONObject)fin.get(i);
				
				System.out.printf("%s \t%s \t%s%n", 
				object.get("rank"), 
				object.get("movieCd"), 
				object.get("movieNm"));
			}
			//JSONObject
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.getMessage();
		} finally {
			if(br != null) try {br.close();} catch(IOException e) {};
		}
	}
}

