package JUNGOL.Beginner_Coder.여러가지;

import java.util.Scanner;
/**
 * 
 * jol_1733 : 오목
 * 
 * @author mihyun
 *
 */
public class 오목 {
	static int[][] map;
	static int[] dr = { -1, -1, 0, 1, 1, 1, 0, -1 };
	static int[] dc = { 0, 1, 1, 1, 0, -1, -1, -1, };

// r-1 c-1
// r+0 c+1
// r+1 c+1
// r+1 c+0
// 이렇게 4부분만!
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		map = new int[20][20]; // 0 : dummy
		int res;

		for (int r = 1; r < 20; r++) {
			for (int c = 0; c < 20; c++) {
				map[r][c] = sc.nextInt(); // 검은 바둑알은 1, 흰 바둑알은 2, 알이 놓이지 않는 자리는 0
			}
		}

//		오목확인, 육목 주의!!!
		for (int r = 0; r < 20; r++) {
			for (int c = 0; c < 20; c++) {
				res = check(r, c);

//				첫줄에 검은색이 이겼을 경우에는 1을, 흰색이 이겼을 경우에는 2를, 아직 승부가 결정되지 않았을 경우에는 0을 출력한다.
				System.out.println(res);

//				검은색 또는 흰색이 이겼을 경우에는 둘째 줄에 연속된 다섯 개의 바둑알 중에서 가장 왼쪽에 있는 바둑알 
//				(연속된 다섯 개의 바둑알이 세로로 놓인 경우, 그 중 가장 위에 있는 것)의 가로줄 번호와, 세로줄 번호를 순서대로 출력한다.
				System.out.printf("%d %d", r, c); // 줄번호 1이상 19이하

			}
		}
	}

	private static int check(int r, int c) {
		if (map[r][c] == 1) {
			for (int d = 2; d < 5; d++) {
				int nr = r + dr[d];
				int nc = c + dc[d];

				int cnt = 0;
				while (map[nr][nc] == map[r][c]) {
					cnt++;
				}
			}
		}
		return 0;
	}

}
