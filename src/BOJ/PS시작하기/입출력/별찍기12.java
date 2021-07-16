package BOJ.PS시작하기.입출력;

import java.util.Scanner;

/**
 * 
 * jol_2522. 별찍기12
 * @author mihyun
 *
 */
public class 별찍기12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // N(1 ≤ N ≤ 100)
		
		for (int i = 0; i < N; i++) {
			// 여백 세팅
			for (int j = N-i-1; j > 0; j--) { // 증감 연산자 j++아니라 j-- <= 헤깔리지X 
				System.out.print(' ');
			}
			// 별찍기
			for (int j = 0; j < i+1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		for (int i = 1; i < N; i++) {
			// 여백 세팅
			for (int j =i; j > 0; j--) { // 증감 연산자 j++아니라 j-- <= 헤깔리지X 
				System.out.print(' ');
			}
			// 별찍기
			for (int j = N-i; j > 0; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
