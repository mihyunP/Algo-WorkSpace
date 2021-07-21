package JUNGOL.Beginner_Coder.재귀;

import java.util.Scanner;

public class 팩토리얼_1309 {
	static long res = 1;
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 팩토리얼의 숫자 n(1≤n≤15)
		
		fact(n);
		
	}

	private static void fact(int n) {
	
	if (n==1) {
		System.out.printf("%d! = %d\n",n,n);
		System.out.println(res);
		return;
	}

	System.out.printf("%d! = %d * %d!\n",n,n,n-1);
	res = res*n;
	fact(n-1);
	}

}
/*
1. res는 재귀 함수 모든 범위에서 값을 누적해야되므로 "전역 변수"로 설정한다.
2. 재귀 함수란 함수 내부에서 자기 자신을 호출하는 것이다.
   대신에 parameter값을 다르게 보낼 수 있다.
3. 
*/