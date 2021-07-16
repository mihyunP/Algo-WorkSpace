package BOJ.PS시작하기.입출력;

import java.util.Scanner;

/**
 * 
 * boj_2442.별찍기5
 * @author mihyun
 *
 */
public class 별찍기5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N(1 ≤ N ≤ 100)
		
		for (int i = 0; i < N; i++) {
			for (int j = N-i; j > 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*(i+1)-1; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
		
	}
}