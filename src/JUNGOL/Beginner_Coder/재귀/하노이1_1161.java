package JUNGOL.Beginner_Coder.재귀;

import java.util.Scanner;

public class 하노이1_1161 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 원판의 개수 N(1≤N≤15)
		
		hanoi(N,1,2,3); // 원판의 개수, 시작 기둥, 임시 기둥, 목적 기둥
		
	}

	private static void hanoi(int n, int from, int temp, int to) {

		if (n==0) {
			return;
		}
		//n-1개 원판 이동
		hanoi(n-1, from, to, temp);
		System.out.println(n+" : "+from+" -> "+to);
		//n-1개 원판 이동
		hanoi(n-1, temp, from, to);
	}

}
