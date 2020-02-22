/*
 * # 최대값 구하기[2단계]
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 */
//12:01-12:09

package day_05;

import java.util.Scanner;

public class WhileEx14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int maxnum = 0;
		
		while(i < 3)
		{
			System.out.println("숫자를 입력하여라");
			int  num = sc.nextInt();
			
			if(maxnum < num)
			{
				maxnum = num;
			}
			i++;
		}
		System.out.println("최댓값은 " + maxnum + "이다.");
	}
}
