/*
 * # 랜덤학생
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 */
//12:13-12:24

package day_05;

import java.util.Scanner;
import java.util.Random;

public class WhileEx15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int i = 0;     //10번 반복시키기 위한 변수
		int num = 1;     //순번
		int maxnum = 0;     //최댓값
		int total = 0;     //총합
		int avg = 0;     //평균
		int count = 0;     //학생 순번
		
		while(i < 10)
		{
			int score = ran.nextInt(100) + 1;     //1~100 사이 랜덤 숫자 저장
			
			System.out.println(num+".학생 성적:" + score);
			
			if(score >= 60)
			{
				System.out.println("합격");
			}
			else
			{
				System.out.println("불합격");
			}
			
			total = total + score;
			
			if(maxnum < score)
			{
				maxnum = score;
				count++;
			}
			
			num++;
			i++;
			
		}
		avg = total/10;
		
		System.out.println("");
		System.out.println("학생들의 성적 평균" + avg);
		System.out.println("1등 학생의 성적" + maxnum);
		System.out.println("1등 학생의 순번" + count);
	}
}
