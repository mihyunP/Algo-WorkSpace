package JUNGOL.Beginner_Coder.자료처리;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기_2858 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		str = str.replace("()", "1");
		int ans = 0;
		
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char tmp = str.charAt(i);
			if (tmp=='(') {
				stack.push(tmp);
			}
			if (tmp=='1') {
				ans += stack.size();
			}
			if (tmp==')') {
				ans += 1; // 마지막 조각
				stack.pop();				
			}
		}
		System.out.println(ans);
	}
}