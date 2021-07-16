package BOJ.PS시작하기.입출력;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 
 * 11022. A+B - 8
 * @author mihyun
 *
 */
public class A더하기B_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T =sc.nextInt();
		
		for (int tc = 1; tc <= T; tc++) {
			
			int A =sc.nextInt();
			int B =sc.nextInt();
			
			System.out.println("Case #"+tc+": "+A+" + "+B+" = "+(A+B));
			// Case #x: A + B = C
		}
		
	}

}

//--------------------------------------------------
// 0. 출력값 모양 잘 만들기 +로 append, 문자열은 쌍따 안에, 띄어쓰기 등 
// 1. 입력값 : System.setIn(new FileInputStream("도시분할계획.txt"));
// 2. 입력_쉬운ver : Scanner sc = new Scanner(System.in);
// 3. 입력_어려운_ver : BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 					 
// 4. 출력_쉬운ver : System.out.println();
// 5. 출력_어려운ver : BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); br.write();, br.newLine();, br.flush();, br.close();

// cf. StringBuilder sb= new StringBuilder();로 문자열 만들어서 한방에 출력