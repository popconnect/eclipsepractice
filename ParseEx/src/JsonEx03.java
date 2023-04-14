import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strJson = "["
				+ "{\"name\" : \"홍길동\", \"city\" : \"서울\" },"
				+ "{\"name\" : \"박문수\", \"city\" : \"경기\" }"
				+ "]";
		
		JSONParser parser = new JSONParser();
		
		try {
			JSONArray arr = (JSONArray)parser.parse(strJson);
			
			
			System.out.println(arr);
			for(int i = 0; i<arr.size(); i++) {
				JSONObject obj = (JSONObject)arr.get(i);
				
				String name = (String)obj.get("name");
				String city = (String)obj.get("city");
				
				System.out.println(name);
				System.out.println(city);
			}
			
			

			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
