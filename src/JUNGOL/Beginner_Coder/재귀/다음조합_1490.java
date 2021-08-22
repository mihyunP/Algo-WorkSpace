package JUNGOL.Beginner_Coder.재귀;

import java.util.Scanner;

public class 다음조합_1490 {
	// NCK : N개 중 K개 뽑는 조합
	static int N,K;
	static int[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt(); // 5≤N≤10
		K = sc.nextInt(); // 1≤K≤N
		
		arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = i+1;
		}
		
//		int[] next = new int[K];
//		for (int i = 0; i < next.length; i++) {
//			next[i] = sc.nextInt();
//		}
		
		comb(0,0,new int[K]);
	}

	private static void comb(int idx, int k, int[] sel) {
		if (k == K) {
			for (int i = 0; i < sel.length; i++) {
				System.out.print(sel[i]+" ");
			}
			System.out.println();
			
			return;
		}
		
		for (int i = idx; i < N; i++) {
			sel[k] = arr[i];
			comb(i + 1, k + 1, sel);
		}
		
	}

}
