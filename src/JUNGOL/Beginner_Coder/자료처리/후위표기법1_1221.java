package JUNGOL.Beginner_Coder.자료처리;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * Jol_1221 : 후위표기법1
 * 
 * @author mihyun
 *
 */
public class 후위표기법1_1221 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();

		int M = sc.nextInt(); // 연산자와 피연산자의 개수의 합 M(3 ≤ M ≤ 11 )
int num1 = 0;
int num2 = 0;
		int res = 0;
		for (int i = 0; i < M; i++) {
			char tmp = sc.next().charAt(0);

			if (tmp == '+' || tmp == '-' || tmp == '*' || tmp == '/') {
				if (tmp == '+') {
					num2 = stack.pop();
					num1 = stack.pop();
					
					res = num1 + num2;
					stack.push(res);
					
				} else if (tmp == '-') {
					num2 = stack.pop();
					num1 = stack.pop();
					
					res = num1 - num2;
					stack.push(res);
				} else if (tmp == '*') {
					num2 = stack.pop();
					num1 = stack.pop();
					
					res = num1 * num2;
					stack.push(res);
				} else if (tmp == '/') {
					num2 = stack.pop();
					num1 = stack.pop();
					
					res = num1 / num2;
					stack.push(res);
				}
			} else {
				stack.push(tmp - '0');
			}
		}
System.out.println(res);
	}
}
/*
 * [후위 표기 수식의 연산] 컴퓨터 내부에서 후위 표기법의 수식을 연산할 때에도 스택을 사용할 수 있다. (1) 피연산자를 만나면 스택에
 * 삽입한다. (2) 연산자를 만나면 필요한 만큼의 피연산자를 스택에서 pop 하여 연산하고, 연산 결과를 다시 스택에 삽입한다. (3)
 * 수식이 끝나면, 마지막으로 스택을 pop 하여 출력한다.
 */