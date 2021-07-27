package JUNGOL.Beginner_Coder.재귀;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class 주사위던지기2_1175_sol {
	   static int n;
	    static int target ;
	    static int[] dice = {1,2,3,4,5,6};
	    static int[] output;
	    private static void combination(int cnt) {
	        // TODO Auto-generated method stub
	        if(cnt==n) {    //조합이 최종(n-1)까지 생성된 순간
	            int sum=0;
	            for (int i = 0; i < n; i++) {
	                sum+=output[i];
	            }
	            if(sum==target) {
	                for (int i = 0; i < n; i++) {
	                    System.out.print(output[i]+" ");
	                }
	                System.out.println();
	            }
	            return;
	        }
	        for (int i = 0; i < 6; i++) {    //작은 수부터 출력
	            output[cnt] = dice[i];
	            combination(cnt+1);    //다음 단계(start++)로 넘어감
	        }
	    }
	  
	    public static void main(String[] args) throws FileNotFoundException {
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();
	        target = sc.nextInt();
	        output = new int[n];
	  
	        combination(0);
	    }
	}