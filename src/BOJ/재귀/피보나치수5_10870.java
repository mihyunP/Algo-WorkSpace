package BOJ.재귀;

import java.util.Scanner;

public class 피보나치수5_10870 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n+1];
		
		if (n==0) {
			arr [0] = 0;
			
		}else {
			arr [1] = 1;
			for (int i = 2; i < n+1; i++) {
				arr[i] = arr[i-2]+ arr[i-1];
			}
		}
		
		System.out.println(arr[n]);
	}

}
