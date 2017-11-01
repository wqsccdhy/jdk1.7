package stack;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < 22; i++) {
			stack.add(String.valueOf(i));
		}
		int size = stack.size();
		System.out.println(size);

	}

}
