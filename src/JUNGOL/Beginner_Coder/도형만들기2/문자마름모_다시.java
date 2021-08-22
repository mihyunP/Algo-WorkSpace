package JUNGOL.Beginner_Coder.도형만들기2;

import java.util.Scanner;

public class 문자마름모_다시 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 마름모의 한변의 길이 N(N의 범위는 100 이하의 양의 정수)
		char[][] arr = new char[2 * N - 1][2 * N - 1];
		char alphabet = 'A';

		// 문자 마름모 만들기
		for (int i = N - 1; i > 0; i--) {
			int r = N - 1 - i;
			int c = N - 1;
			// 좌하
			for (int j = 0; j < i; j++) {
				arr[r++][c--] = alphabet++;
				if (alphabet > 'Z') { // 알파벳 대문자 범위를 벗어날 때 A로 초기화 해줘야 함.
					alphabet = 'A';
				}
			}
			
//			--c;
			// 우하
			for (int j = 0; j < i; j++) {
				arr[r++][c++] = alphabet++;
				if (alphabet > 'Z') { // 알파벳 대문자 범위를 벗어날 때 A로 초기화 해줘야 함.
					alphabet = 'A';
				}
			}
			// 우상
			for (int j = 0; j < i; j++) {
				arr[r--][c++] = alphabet++;
				if (alphabet > 'Z') { // 알파벳 대문자 범위를 벗어날 때 A로 초기화 해줘야 함.
					alphabet = 'A';
				}
			}
			// 좌상
			for (int j = 0; j < i; j++) {
				arr[r--][c--] = alphabet++;
				if (alphabet > 'Z') { // 알파벳 대문자 범위를 벗어날 때 A로 초기화 해줘야 함.
					alphabet = 'A';
				}
			}
			// 왼쪽으로 1칸

		}
	
			arr[N-1][N-1] = alphabet;
		
		// 출력하기
		for (int r = 0; r < 2 * N - 1; r++) {
			for (int c = 0; c < 2 * N - 1; c++) {
				if (arr[r][c] == '\0') {
					arr[r][c] = ' ';
				}
				System.out.print(arr[r][c] + " "); 
			}
			System.out.println();
		}

	}
}
