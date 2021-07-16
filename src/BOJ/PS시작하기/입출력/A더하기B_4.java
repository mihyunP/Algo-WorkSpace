package BOJ.PS시작하기.입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * boj_10951. A+B(4)  
 * @author parkm
 *
 */
public class A더하기B_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = "";

        while((s = br.readLine()) != null){
            StringTokenizer st = new StringTokenizer(s, " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(a+b).append('\n');
        }

        System.out.println(sb);
    }
}

 /* (방법 1) 테스트케이스 개수가 주어지지 않을 경우 while문 조건절에 hasNextInt()를 넣는다.
 * hasNextInt() : 입력값이 정수일경우 true를 반환하며 정수가 아닐경우 바로 예외를 던지며 더이상의 입력을 받지 않고 
 * false를 반환한다.
 * 
 * (방법2)BufferedReader랑 StringTokenizer 사용하기
 * BufferedReader로 한줄 전체 입력받고, StringTokenizer로 공백 단위로 끊어서 읽어오기
 */
