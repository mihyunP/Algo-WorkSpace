package BOJ.PS시작하기.입출력;

import java.util.Scanner;

/**
 * 
 * boj_2439.별찍기2
 * @author mihyun
 *
 */
public class 별찍기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			// 빈칸용
			for (int j = 0; j < N-i-1; j++) {
				System.out.print(" ");
			}
			// 별용
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}