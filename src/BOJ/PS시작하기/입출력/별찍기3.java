package BOJ.PS시작하기.입출력;

import java.util.Scanner;

/**
 * 
 * boj_2440.별찍기3
 * @author mihyun
 *
 */
public class 별찍기3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // N(1 ≤ N ≤ 100)
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N-i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
	}

}
