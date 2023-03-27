
import java.util.ArrayList;

public class DataEx01 {
	public static void main(String[] args) {
		
		Student s1 = new Student("1", "홍길동", "010-1111-1111", "20", "서울시");
		Student s2 = new Student("2", "박문수", "010-2222-2222", "22", "경기도");
		Student s3 = new Student("3", "임꺽정", "010-3333-3333", "25", "강원도");
		
		ArrayList<Student> datas = new ArrayList<>();
		datas.add(s1);
		datas.add(s2);
		datas.add(s3);
		
		for (Student s : datas) {
			System.out.println(s.getSeq());
			System.out.println(s.getName());
		}
	}
}
