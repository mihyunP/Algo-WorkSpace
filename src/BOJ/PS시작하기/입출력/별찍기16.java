package BOJ.PS시작하기.입출력;

import java.util.Scanner;

/**
 * 
 * boj_10991. 별찍기16
 * @author mihyun
 *
 */
public class 별찍기16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt(); //  N(1 ≤ N ≤ 100)
		
		for (int i = 0; i < N; i++) {
			// 공백세팅
			for (int j = 0; j < N-1-i; j++) {
				System.out.print(' ');
			}
			
			// 별세팅
			for (int j = 0; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
