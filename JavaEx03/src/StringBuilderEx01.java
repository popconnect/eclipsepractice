import java.lang.module.ModuleDescriptor.Builder;

public class StringBuilderEx01 {
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder(100);
		StringBuilder sb3 = new StringBuilder("Hello StringBuilder");
		
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());
		
		System.out.println(sb1.length());
		System.out.println(sb2.length());
		System.out.println(sb3.length());
		
		
		System.out.println(sb3.charAt(0));
		System.out.println(sb3.substring(4));
		System.out.println(sb3);
		
		 //indexOf / lastIndexOf
		//replace
		//append/ insert / delete
		
		StringBuilder builder = new StringBuilder("사봉-용산-사가정-봉마산");
		builder.append("-중곡");
		System.out.println(builder);
		builder.insert(3, "면목");
		System.out.println(builder);
		builder.delete(5, 8);
		System.out.println(builder);
		builder.replace(0, 1, "상");
		System.out.println(builder);
		System.out.println(builder.reverse());
		
		
	}
}
