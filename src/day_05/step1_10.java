/*
 * # 쇼핑몰 뒤로가기
 * 1. 남성의류
 * 		1) 티셔츠
 * 		2) 바지
 * 		3) 뒤로가기
 * 2. 여성의류
 * 		1) 가디건
 * 		2) 치마
 * 		3) 뒤로가기
 * 3. 종료
 */
//12:28 - 12:36

package day_05;

import java.util.Scanner;

public class step1_10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1.남성의류");
			System.out.println("2.여성의류");
			System.out.println("3.종료");
			
			System.out.print("메뉴 선택 : ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("1)티셔츠");
				System.out.println("2)바지");
				System.out.println("3)뒤로가기");
				
				System.out.println("선택해주세요");
				int choice = sc.nextInt();
				
				if(choice == 3)
				{
					System.out.println("1.남성의류");
					System.out.println("2.여성의류");
					System.out.println("3.종료");
				}
				else if(choice == 2)
				{
					System.out.println("바지의 가격은 1000원 입니다");
				}
				else if(choice == 1)
				{
					System.out.println("티셔츠의 가격은 2000원 입니다");
				}
			}
			else if(select == 2) {
				System.out.println("1)티셔츠");
				System.out.println("2)바지");
				System.out.println("3)뒤로가기");
				
				System.out.println("선택해주세요");
				int choice = sc.nextInt();
				
				if(choice == 3)
				{
					System.out.println("1.남성의류");
					System.out.println("2.여성의류");
					System.out.println("3.종료");
				}
				else if(choice == 2)
				{
					System.out.println("바지의 가격은 1000원 입니다");
				}
				else if(choice == 1)
				{
					System.out.println("티셔츠의 가격은 2000원 입니다");
				}
			}
			else if(select == 3) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		System.out.println("");
	}
}
