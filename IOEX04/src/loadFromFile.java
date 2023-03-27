import java.io.FileReader;
import java.util.Properties;
import java.util.Set;

public class loadFromFile {
	Properties props = new Properties();
	try (FileReader input = new FileReader(PROP_FILE_PATH)) {
		props.load(input);
		Set<String> keys = props.stringPropertyNames();
		for(String key:keys) {
			System.out.println(key + " : " + props.getProperty(key));
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saveToFile();
		loadFromFile();
	}

}
