package BOJ.PS시작하기.입출력;

import java.util.Scanner;

/**
 * 
 * boj_2441.별찍기4
 * @author mihyun
 *
 */
public class 별찍기4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // N(1 ≤ N ≤ 100)
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < N-i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
	}

}

/*
 * 빈칸 만드는 법 : 
*/