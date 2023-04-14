import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ParsingEx03 {
	public static void main(String[] args) {
		BufferedReader br = null;
		String url = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/movie/searchMovieInfo.xml?key=f5eef3421c602c6cb7ea224104795888&movieCd=20124079";
		
		
		try {

			URLConnection conn = new URL(url).openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String data = br.readLine();
			Document doc = Jsoup.parse(data);
			//System.out.println(doc);
			
			Elements cdTags = doc.getElementsByTag("movieCd");
			Elements nmTags = doc.getElementsByTag("movieNm");
			Elements actorsTags = doc.getElementsByTag("actor");
			
			
			
			//System.out.println(rankTags);
			
			for(int i = 0; i<cdTags.size(); i++) {
				Element cdTag = cdTags.get(i);
				System.out.println(cdTag.text());
			}
			for(int i = 0; i<nmTags.size(); i++) {
				Element nmTag = nmTags.get(i);
				System.out.println(nmTag.text());
			}
			for(int i = 0; i<actorsTags.size(); i++) {
				Element actorsTag = actorsTags.get(i);
				System.out.println(actorsTag.text().replaceAll("/", " "));
				
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

