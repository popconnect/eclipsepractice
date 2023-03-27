
import java.io.*;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.*;
public class LottoExcel {

	public static void main(String[] args) {
			Workbook workBook = null;
			String outputFilePath = "result.txt";
			Sheet sheet;
			try {
				workBook = Workbook.getWorkbook(new FileInputStream("./lotto(1~1060).xls"));
				String outputFilePath1 = "result.txt";
				BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath1));
				sheet = workBook.getSheet(0);
				for(int i = 4; i<sheet.getColumns(); i++) {
				Cell cell1 = sheet.getCell(2-1, i-1);
				Cell cell2 = sheet.getCell(3-1, i-1);
				Cell cell3 = sheet.getCell(14-1, i-1);
				Cell cell4 = sheet.getCell(15-1, i-1);
				Cell cell5 = sheet.getCell(16-1, i-1);
				Cell cell6 = sheet.getCell(17-1, i-1);
				Cell cell7 = sheet.getCell(18-1, i-1);
				Cell cell8 = sheet.getCell(19-1, i-1);
				Cell cell9 = sheet.getCell(20-1, i-1);
				System.out.print(cell1.getContents());
				System.out.print(cell2.getContents());
				System.out.print(cell3.getContents());
				System.out.print(cell4.getContents());
				System.out.print(cell5.getContents());
				System.out.print(cell6.getContents());
				System.out.print(cell7.getContents());
				System.out.print(cell8.getContents());
				System.out.println(cell9.getContents());
				bw.write(cell1.getContents());
				bw.write(cell2.getContents());
				bw.write(cell3.getContents());
				bw.write(cell4.getContents());
				bw.write(cell5.getContents());
				bw.write(cell6.getContents());
				bw.write(cell7.getContents());
				bw.write(cell8.getContents());
				bw.write(cell9.getContents());
				}
						
					
			} catch (BiffException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	}
}
	        
	        	
	            
	        
