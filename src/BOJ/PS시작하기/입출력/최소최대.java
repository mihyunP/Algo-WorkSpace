package BOJ.PS시작하기.입출력;

import java.util.Scanner;

/**
 * 
 * boj_1018.최소, 최대
 * @author mihyun
 *
 */
public class 최소최대 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int[] arr = new int[N];
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			
			if (min>arr[i]) {
				min= arr[i];
			}
			if (max<arr[i]) {
				max = arr[i];
			}
			// 각 턴별 min값, max값 갱신하기
		}
		
		System.out.printf("%d %d", min, max);
	}

}