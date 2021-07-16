package JUNGOL.Beginner_Coder.여러가지;

import java.util.Scanner;

/**
 * 
 * jol_1031 : 빙고
 * 
 * @author mihyun
 *
 */
public class 빙고 {
	static int[][] arr;
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		arr = new int[5][5];

		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				arr[r][c] = sc.nextInt();
			}
		} // 빙고판 세팅

		int turn = CallNumber(); // 부른 숫자를 0으로 바꿈
		BingoCheck(); // 0인 줄(0이 5개) 개수 세기
		System.out.println(turn);
	}

	private static void BingoCheck() {
		int cnt = 0; // 0인 줄의 개수

		int[] dr = { 0, 1, 1 };
		int[] dc = { 1, 1, 0 }; // 우, 우하, 하
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < c; c++) {
				int num=0;

				for (int d = 0; d < 3; d++) {
					int nr = r + dr[d];
					int nc = c + dc[d];

					if (nr >= 0 && nc >= 0 && nr < 5 && nc < 5) {
						if (arr[nr][nc] == 0) {
							num++;
						}
					}
				}
				if(cnt==3) return;
			}
		}
	}

	private static int CallNumber() {
		int i = sc.nextInt();
		int turn = 0; 
		for (int r = 0; r < 5; r++) {
			for (int c = 0; c < 5; c++) {
				if (i == arr[r][c]) {
					arr[r][c] = 0;
					turn++;
				}
			}
		}
		return turn;

	}
}
