package BOJ.PS시작하기.입출력;

import java.util.Scanner;

/**
 * 
 * boj_11720. 숫자의 합  
 * @author mihyun
 *
 */
public class 숫자의합 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();

		int sum=0;
		for (int i = 0; i < n; i++) {
			String tmp = str.charAt(i)+"";
			sum += Integer.parseInt(tmp);
		}
		
		System.out.println(sum);
	}

}
//-----------------------------------------------------------
// Scanner 클래스
// 1. sc.nextLine()은 sc.nextInt(),sc.nextlong(),sc.nextDouble(), sc.next()등이 버퍼에 남겨둔 "\n" 개행 가져옴
// 따라서, 쓰기 전에 sc.nextLine();으로 먼저 버퍼 비우기
// 2. 문자는 바로 못받고 next(), nextLine()사용해 String str으로 받아와서 str.charAt()으로 끊어주기
// 3. Integer.parseInt()는 String만 인자로 받는다. : 문자열->숫자로 바꿔줌 cf. "7 " !=7 안된다.
// 4. String tmp = str.charAt(i)+""; 문자를 문자열로 만들기 위해서 의미없는""추가함