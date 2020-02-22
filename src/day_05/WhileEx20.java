package day_05;

import java.util.Scanner;

public class WhileEx20 {
	public static void main(String[] args) {
		
		
		for(int i=0; i<15; i++)
		{
			if(i > 3)
			{
				break;
			}
			System.out.println(i);
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.햄버거");
			System.out.println("2.콜라");
			System.out.println("3.감자");
			
			int sel = sc.nextInt();
			
			if(sel != 1 && sel != 2 && sel !=3)
			{
				continue;		//1번 2번 3번 선택안했을 때 조건 검사 다시
			}
			
			if(sel == 1)
			{
				System.out.println("햄버거는 5900원입니다.");
			}
			else if(sel == 2)
			{
				System.out.println("콜라느 1900원입니다.");
			}
			else if(sel == 3)
			{
				System.out.println("감자 3900원입니다.");
			}
			
		}
	}
}
