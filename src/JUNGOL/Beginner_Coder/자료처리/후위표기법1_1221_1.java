package JUNGOL.Beginner_Coder.자료처리;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 * Jol_1221 : 후위표기법1
 * 
 * @author mihyun
 *
 */
public class 후위표기법1_1221_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt(); // 연산자와 피연산자의 개수의 합 M(3 ≤ M ≤ 11 )
		int res = 0;

		Queue<Character> oper = new LinkedList<>();
		ArrayList<Integer> num = new ArrayList<Integer>();

		for (int i = 0; i < M; i++) {
			char tmp = sc.next().charAt(0);
			if (tmp < '0') { // + : 75, - : 77, * : 74, / : 79, 0 : 80
				oper.add(tmp);
			} else {
				int nTmp = tmp - '0'; // tmp에는 문자가 들어감, 따라서 tmp -'0' 해주기
				num.add(nTmp);
			}
		} // input

		for (int i = 0; i < oper.size(); i++) {
			System.out.printf("%d %c\n",i, oper.poll());
		}

//		System.out.println();
//
//		for (int i = 0; i < num.size(); i++) {
//			System.out.print(num.get(i)+" ");
//		}
//
//		while (!oper.isEmpty()) {
//			char operator = oper.poll();
//			if ( operator == '+') {
//
//				res = num.get(0) + num.get(1);
//				num.remove(0);
//				num.remove(1);
//				num.add(0, res);
//
//			} else if (operator == '-') {
//				res = num.get(0) - num.get(1);
//				num.remove(0);
//				num.remove(1);
//				num.add(res, 0);
//
//			} else if (operator == '*') {
//				res = num.get(0) * num.get(1);
//				num.remove(0);
//				num.remove(1);
//				num.add(res, 0);
//
//			} else if (operator == '/') {
//				res = num.get(0) / num.get(1);
//				num.remove(0);
//				num.remove(1);
//				num.add(res, 0);
//
//			} // 계산
//
//		}

//		System.out.println(res);
	}
}

/* 연산자 연산자끼리
숫자 숫자끼리
*/