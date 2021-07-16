package BOJ.PS시작하기.입출력;

import java.util.Scanner;

/**
 * 
 * boj_2445. 별찍기
 * 
 * @author mihyun
 *
 */
public class 별찍기8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // N(1 ≤ N ≤ 100)

		for (int i = 0; i < N; i++) {

			for (int j = 0; j < i + 1; j++) {
				System.out.print('*');
			}
			for (int j = 0; j < 2 * (N - i - 1); j++) {
				System.out.print(' ');
			} // 2씩 증가? ex. N==5, i=0일때 j=0부터 j<8까지	i=1일때 j=0부터 j<6까지 ... 이런식으로 되니까 2씩 증가함

			for (int j = 0; j < i + 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

		for (int i = N; i>0; i--) {

			for (int j = i-1; j > 0; j--) {
				System.out.print('*');
			}
		
			for (int j = (N-i+1)*2;j>0; j--) {
				System.out.print(' ');
			}

			for (int j = i-1; j > 0; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}

/* 
 * 총 0~2*N-1행
 * 1. 0~N행까지 for문
 * 2. N+1~2*N-1행까지 for문
 * 나눠서 돌리기
 */
