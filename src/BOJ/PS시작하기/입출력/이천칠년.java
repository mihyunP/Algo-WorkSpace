package BOJ.PS시작하기.입출력;

import java.util.Scanner;

/**
 * 
 * boj_1924. 2007년
 * @author mihyun
 *
 */
public class 이천칠년 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
//		참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
//		첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
		
		int day=0;
		int resDay;
		String[] res = {"SUN","MON","TUE", "WED", "THU", "FRI","SAT"};
		
		switch (x) {
		case 1:
			resDay=(day+y)%7;
			System.out.println(res[resDay]);
			break;
		case 2:
			resDay=(day+31+y)%7;
			System.out.println(res[resDay]);
			break;
		case 3:
			resDay=(day+31+28+y)%7;
			System.out.println(res[resDay]);
			break;
		case 4:
			resDay=(day+31+28+31+y)%7;
			System.out.println(res[resDay]);
			break;
		case 5:
			resDay=(day+31+28+31+30+y)%7;
			System.out.println(res[resDay]);
			break;
		case 6:
			resDay=(day+31+28+31+30+31+y)%7;
			System.out.println(res[resDay]);
			break;
		case 7:
			resDay=(day+31+28+31+30+31+30+y)%7;
			System.out.println(res[resDay]);
			break;
		case 8:
			resDay=(day+31+28+31+30+31+30+31+y)%7;
			System.out.println(res[resDay]);
			break;
		case 9:
			resDay=(day+31+28+31+30+31+30+31+31+y)%7;
			System.out.println(res[resDay]);
			break;
		case 10:
			resDay=(day+31+28+31+30+31+30+31+31+30+y)%7;
			System.out.println(res[resDay]);
			break;
		case 11:
			resDay=(day+31+28+31+30+31+30+31+31+30+31+y)%7;
			System.out.println(res[resDay]);
			break;
		case 12:
			resDay=(day+31+28+31+30+31+30+31+31+30+31+30+y)%7;
			System.out.println(res[resDay]);
			break;

		default:
			break;
		}
	}

}


/* (팁) 지난 날수 쉽게 더하는 법
 * int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};로 만들어 놓고 
 * for문 돌려서 더하기
 * 
 * -> x월 y일 하면,
 * 1월부터 x-1월까지 모든 날짜를 다 더하고 x월의 y일까지 더해주고 7로 나눈 나머지를 구해줘서 
 * 그 나머지의 값마다 요일을 부여해주면 됨.
 */