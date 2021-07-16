package BOJ.PS시작하기.입출력;

import java.util.Scanner;

/**
 * 
 * boj_11721. 열 개씩 끊어 출력하기
 * 
 * @author mihyun
 *
 */
public class 열개씩끊어출력하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		// 10의 배수일 때
		if (input.length() % 10 == 0) {
			int start = 0;
			for (int i = 0; i < input.length() / 10; i++) {
				String oneline = input.substring(start, start + 10);
				start += 10;
				System.out.println(oneline);
			}
		}
		// 10의 배수가 아닐 때
		else {
			int start = 0;
			for (int i = 0; i < input.length() / 10 + 1; i++) {
				String oneline = input.substring(start, start + 10 > input.length() ? input.length() : start + 10);
				start += 10;
				System.out.println(oneline);
			}
		}

	}
}

// 1. substring(시작 인덱스, 끝 인덱스+1)
// ex. substring(0,10) : 인덱스 번호 0부터 9번까지 출력함, substring(10,20) : 인덱스 번호 10부터 19까지 출력함
// 2. 마지막 인덱스+1은 문자열의 길이(==input.length())와 같다.
// 3. 10의 배수일 땐 문자열의 길이/10회 반복, 10의 배수가 아닐 땐 문자열의 길이/10 +1회 반복해서 떨가지들까지 출력 해야함.