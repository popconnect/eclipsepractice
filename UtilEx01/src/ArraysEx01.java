import java.util.Arrays;
import java.util.List;

public class ArraysEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrs = { "aaa", "bbb", "ccc" };
		System.out.println(Arrays.toString(arrs));
		
		Arrays.fill(arrs, "xxx");
		System.out.println(Arrays.toString(arrs));
		Arrays.fill(arrs, 0, 2, "yyy");
		System.out.println(Arrays.toString(arrs));
		String[] arrs1 = { "aaa", "bbb", "ccc" };
		String[] arrs2 = { "aaa", "bbb", "ccc" };
		
		System.out.println(arrs1 == arrs2); //참조값 비교
		System.out.println(Arrays.equals(arrs1, arrs2)); //내용 비교
		
		Integer[] arrNum = {5, 2, 3, 1, 4};
		Arrays.sort(arrNum);
		System.out.println(Arrays.toString(arrNum));
		
		List<String> lists = Arrays.asList(arrs1);
		System.out.println(lists);
	}

}
