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
3. 재귀함수는 스택에 쌓인다. 
4. parameter는 함수 block 내부에서만 사용 가능하다.
5. java 메모리 구조 : 메소드(method) 영역, 힙(heap) 영역, 스택(stack) 영역
메소드(method) 영역 - 자바 프로그램에서 사용되는 클래스에 대한 정보와 함께 클래스 변수(static variable)가 저장되는 영역
힙(heap) 영역 - 자바 프로그램에서 사용되는 모든 인스턴스 변수가 저장되는 영역
스택(stack) 영역 - 자바 프로그램에서 메소드가 호출될 때 메소드의 스택 프레임이 저장되는 영역, 메소드의 호출과 함께 할당되며 메소드의 호출이 완료되면 소멸
*/