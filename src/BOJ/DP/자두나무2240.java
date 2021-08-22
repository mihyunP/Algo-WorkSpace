package BOJ.DP;

import java.util.Scanner;

public class 자두나무2240 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //  자두가 떨어지는 시간(1≤T≤1,000)초
		int W = sc.nextInt(); // 최대 이동 횟수(1≤W≤30)
		int[] arr = new int[T]; // 자두가 떨어지는 나무의 번호
		

		// 이동횟수
		int[][][] dp = new int[T+1][3][W+1]; // int[][][] dp = new int[자두가 몇번째 떨어지는가][자두(사람이름)이 어느 위치에 있냐][이동횟수]
		
		int n = sc.nextInt(); // t=1일때 자두가 떨어지는 위치

		if (n == 1) {
			dp[1][1][0] = 1;
			dp[1][2][1] = 0;
		}

		else if (n == 2) {
			dp[1][1][0] = 0;
			dp[1][2][1] = 1;
		}

		for (int t = 2; t <= T; t++) {
			n = sc.nextInt(); // t초에 자두가 떨어지는 위치

			if (n == 1) {
				dp[t][1][0] = dp[t - 1][1][0] + 1;
				dp[t][2][0] = dp[t - 1][2][0];

				for (int w = 1; w <= W; w++) {
					dp[t][1][w] = Math.max(dp[t - 1][1][w], dp[t - 1][2][w - 1]) + 1;
					dp[t][2][w] = Math.max(dp[t - 1][1][w - 1], dp[t - 1][2][w]);
				}
			}

			else if (n == 2) {
				dp[t][1][0] = dp[t - 1][1][0];
				dp[t][2][0] = dp[t - 1][2][0] + 1;

				for (int w = 1; w <= W; w++) {
					dp[t][1][w] = Math.max(dp[t - 1][1][w], dp[t - 1][2][w - 1]);
					dp[t][2][w] = Math.max(dp[t - 1][1][w - 1], dp[t - 1][2][w]) + 1;
				}
			}
		}

		int max = 0;
		for (int w = 0; w <= W; w++) {
			max = Math.max(max, Math.max(dp[T][1][w], dp[T][2][w]));
		}
		System.out.println(max);
	}

}
