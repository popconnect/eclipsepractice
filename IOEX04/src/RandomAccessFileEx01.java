import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.Ref;
import java.util.Random;

public class RandomAccessFileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomAccessFile ref = null;
		try {
			ref = new RandomAccessFile("./score.dat", "rw");
			
			int[] score = {
					1, 100, 90, 90,
					1, 7, 90, 100,
					3, 100, 100, 100
			};
			
			for (int i=0; i<score.length; i++) {
				ref.writeInt(score[i]);
				System.out.println("파일포인터: " + ref.getFilePointer());
			}
			System.out.println("저장완료");
			ref.seek(16);
			
			while(true) {
				System.out.println(ref.readInt());
			}
			
		} catch (EOFException e) {
			System.out.println("읽기종료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] : " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] : " + e.getMessage());
		} finally {
			if(ref != null) try {ref.close();} catch(IOException e) {}
		}
	}

}
