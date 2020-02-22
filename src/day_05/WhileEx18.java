/*
 * # 카카오 택시
 * 1. 손님을 태워 목적지까지 이동하는 게임이다.
 * 2. -10~10 사이의 랜덤 숫자 2개를 저장해 목적지로 설정한다.
 * 3. 메뉴는 아래와 같다.
 * 		1) 속도설정 : 1~3까지만 가능
 * 		2) 방향설정 : 동(1)서(2)남(3)북(4)
 * 		3) 이동하기 : 설정된 방향으로 설정된 속도만큼 이동
 * 4. 거리 2칸 당 50원씩 추가되어 요금도 출력한다.
 * 예) 1(50) 2(50) 3(100) 4(100) ...
 */
//12:38-01:00

package day_05;

import java.util.Scanner;
import java.util.Random;

public class WhileEx18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int dst_x = ran.nextInt(21) - 1;
		int dst_y = ran.nextInt(21) - 1;
		
		int x=0;		//현재 위치
		int y=0;		//현재 위치
		int dir=0;		//방향
		int speed=0;	//속도
		int total=0;		//이동
		int fee=0;
		
		while(true)
		{
			System.out.println("= 카카오 택시 =");
			System.out.println("목적지: "+ dst_x +"," + dst_y);
			System.out.println("현위치: "+ x +"," + y);
			System.out.println("방  향:"+dir);
			System.out.println("속 도:"+speed);
			System.out.println("=================");
			
			System.out.println("1.방향 설정");
			System.out.println("2.속도 설정");
			System.out.println("3.이동 하기");
			System.out.println("메뉴 선택 : ");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				System.out.println("방향 입력[동1 서2 남3 북4]");
				dir = sc.nextInt();
			}
			else if(select == 2)
			{
				System.out.println("속도 입력[1~3]");
				speed = sc.nextInt();
			}
			else if(select ==3)
			{
				if(dir == 1) 
				{
					x = x + speed;
				}
				else if(dir == 2) 
				{
					x = x - speed;
				}
				else if(dir == 3) 
				{
					y = y - speed;
				}
				else if(dir == 4) 
				{
					y = y + speed;
				}
				
				total = total + speed;
			}
			
			if(dst_x == x && dst_y == y)
			{
				if(total % 2 ==1)
				{
					fee =fee + 50;
				}
				fee =fee + total/2*50;
				
				System.out.println("택시비:" + fee);
				break;
			}
		}
		
		
	}
}
