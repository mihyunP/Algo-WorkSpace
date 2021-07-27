package JUNGOL.Beginner_Coder.재귀;

import java.util.Scanner;

public class 주사위던지기1_1169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 주사위를 던진 횟수 N
		int M = sc.nextInt(); // 출력형식 M
		int[] arr = new int[N];
		boolean[] visited = new boolean[6];
		
		switch (M) {
		case 1:
//			M = 1 : 주사위를 N번 던져서 나올 수 있는 모든 경우 : 중복 조합
			rec1(N,arr,0);

			break;
		case 2:
//			M = 2 : 주사위를 N번 던져서 중복이 되는 경우를 제외하고 나올 수 있는 모든 경우 : 조합
//			rec2(N,arr,visited, 0);
			
			break;
		case 3:
//			M = 3 : 주사위를 N번 던져서 모두 다른 수가 나올 수 있는 모든 경우
//			rec3(N,arr);
			
			break;
		default:
			break;
		}
	}

	private static void rec1(int N, int[] arr,int i) {
		if (arr.length==N) {
			
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j]);
			}
			
			return;
		}
		rec1(N, arr,i+1);
	}

}
