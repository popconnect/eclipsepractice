import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JexcelEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Workbook workBook = null;
		
		try {
			workBook = Workbook.getWorkbook(new FileInputStream("./jxlrwtest.xls"));
			System.out.println(workBook.getVersion());
			System.out.println("워크시트개수 : " + workBook.getNumberOfSheets());
			String[] sheetName = workBook.getSheetNames();
			System.out.println(Arrays.toString(sheetName));
			
			Sheet sheet = workBook.getSheet(0);
			System.out.println(sheet.getName());
			System.out.println(sheet.getRows());
			System.out.println(sheet.getColumns());
			
			Cell cell = sheet.getCell(0, 2);
			System.out.println(cell.getContents());
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] : " + e.getMessage());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] : " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] : " + e.getMessage());
		}if(workBook != null) workBook.close();
		
		
         BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath));
         for (int i = 0; i < counts.length; i++) {
             bw.write((i + 1) + ": " + counts[i] + "\n");
         }
         bw.close();
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
}
