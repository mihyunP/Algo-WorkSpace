package BOJ.PS시작하기.입출력;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * boj_11719. 그대로 출력하기2
 * 
 * @author mihyun
 * 
 */
public class 그대로출력하기2 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
		// hasNextLine() : Returns true if there is another line in the input of this scanner.
			String str = sc.nextLine();
			System.out.println(str);
		}
		sc.close();
	}
}
