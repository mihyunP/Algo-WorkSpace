package BOJ.PS시작하기.입출력;

import java.util.Scanner;

/**
 * 
 * boj_2739. 구구단
 * @author mihyun
 *
 */
public class 구구단 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //  N은 1보다 크거나 같고, 9보다 작거나 같다.
		
		for (int i = 1; i < 10 ; i++) {
			System.out.printf("%d * %d = %d \n",N,i,N*i);
//			System.out.println();
		}
	}

}
