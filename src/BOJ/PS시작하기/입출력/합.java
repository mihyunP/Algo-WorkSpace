package BOJ.PS시작하기.입출력;

import java.util.Scanner;

/**
 * 
 * boj_8393. 합
 * @author mihyun
 *
 */
public class 합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < n+1; i++) {
			sum+=i;
		}
		
		System.out.println(sum);
	}
}
