package BOJ.PS시작하기.입출력;

import java.util.Scanner;

/**
 * 
 * boj_10992. 별찍기17
 * @author mihyun
 *
 */
public class 별찍기17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N =sc.nextInt(); //  N(1 ≤ N ≤ 100)
		
		for (int i = 0; i < N; i++) {
			// 공백세팅
			for (int j = 0; j < N-1-i; j++) {
				System.out.print(' ');
			}
			
			
			if (N==1) {
				System.out.print("*");
				return;
			}
			else if (i==0) {
				System.out.print("*");
			}
			// i != N-1일때
			else if (i != N-1) {
				System.out.print('*');
				for (int j = 0; j < 2*i-1; j++) {
					System.out.print(' ');
				}
				System.out.print('*');
			}
			
			// i == N-1일때
			else {
				for (int j = 0; j <2*i+1; j++) {
					System.out.print("*");
				}				
			}
			
			
			System.out.println();
		}
		
	}

}
