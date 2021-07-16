package BOJ.PS시작하기.입출력;

import java.util.Scanner;

/**
 * 
 * boj_2438.별찍기1
 * @author mihyun
 *
 */
public class 별찍기1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // N(1 ≤ N ≤ 100)
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
		
	}
}

/*
 * for(int j=0; j<0;j++){
 * 	system.out.println("*"); // 이부분 실행 안됨
 * }
 */
