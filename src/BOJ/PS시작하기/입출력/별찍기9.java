package BOJ.PS시작하기.입출력;

import java.util.Scanner;

/**
 * 
 * jol_2446. 별찍기9
 * @author mihyun
 *
 */
public class 별찍기9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // (1 ≤ N ≤ 100)
		
		for (int i = 0; i < N; i++) {
			// 여백
			for (int j = 0; j < i; j++) {
				System.out.print(' ');
			}
			
			// 별
			for (int j = 2*(N-i)-1; j >0 ; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		for (int i = 0; i < N-1; i++) {
			// 여백
			for (int j = 0; j < N-2-i; j++) {
				System.out.print(' ');
			}
			
			// 별
			for (int j = 2*(i+2)-1; j >0 ; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
		
		
		
	}
}
