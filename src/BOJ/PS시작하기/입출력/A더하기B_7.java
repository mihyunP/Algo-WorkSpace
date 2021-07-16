package BOJ.PS시작하기.입출력;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A더하기B_7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=T;tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write("Case #"+tc+": "+(a+b)+"\n");
			bw.flush();
		}
		bw.close();
	}
}

//BufferedWriter 사용하기
//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//bw.write();에서 맨 마지막에 "\n" 추가하기 또는 bw.write()다음에 bw.newLine();추가하기
//bw.flush();
//bw.close();