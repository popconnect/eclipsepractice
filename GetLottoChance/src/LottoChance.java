import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LottoChance {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\KITCOOP\\Desktop\\lotto(1~1059).csv";
        int[] counts = new int[45];
        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    try {
                        int num = Integer.parseInt(value.trim());
                        if (num >= 1 && num <= 45) {
                            counts[num - 1]++;
                        }
                    } catch (NumberFormatException e) {
                    	System.out.println("[에러] : " + e.getMessage());
                    }
                }
            }
            br.close();
            for (int i = 0; i < counts.length; i++) {
                System.out.println((i + 1) + "번에 대한 당첨확률은 : " + counts[i] + "\n");
            }
            
        } catch (IOException e) {
            System.out.println("[에러] : " + e.getMessage());
        }
    }
}