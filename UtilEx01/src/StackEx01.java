package UtilEx01.src;

import java.util.Queue;
import java.util.Stack;

public class StackEx01 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		
		stack.push("홍길동");
		stack.push("박문수");
		stack.push("임꺽정");
		
		//선입후출
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.pop());
		
		
	}
}
