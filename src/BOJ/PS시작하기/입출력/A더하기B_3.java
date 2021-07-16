package BOJ.PS시작하기.입출력;

import java.util.Scanner;

/**
 * 
 * boj_10950. A+B-3
 * @author mihyun
 *
 */
public class A더하기B_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int T=sc.nextInt();
		for(int tc =1; tc<=T; tc++) {
			int A =sc.nextInt();
			int B = sc.nextInt();
			sb.append(A+B).append("\n");
		}
		System.out.print(sb.toString());
	}

}
