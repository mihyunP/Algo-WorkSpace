package BOJ.PS시작하기.입출력;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A더하기B_5 {

	public static void main(String[] args) throws IOException {
		/*
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			if(a==0 && b==0) {break;}
			System.out.println(a+b);
		}
		*/	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in)); // bufferedreader 객체 생성
		while(true) {
			
		
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			// br.readLine() : 엔터 단위로 한줄 단위로 읽어옴, 이때 한줄은 문자열임 "1 1" cf.Scanner는 애초에 공백단위로 입력 받는다.
			// StringTokenizer로 공백 단위로 끊어읽기
			// BufferedReader 객체 여러번 만들 필요없다. br.readLine()만 여러번 해서 한줄 단위로 읽어오면 됨.
			// StringTokenizer는 br.readLine()할때마다 만들어야 됨. 행 내에서 끊어읽어야하니까
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a==0&&b==0) {break;}
			System.out.println(a+b);
		}
	}

}