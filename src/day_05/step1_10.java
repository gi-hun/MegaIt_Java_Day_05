/*
 * # ���θ� �ڷΰ���
 * 1. �����Ƿ�
 * 		1) Ƽ����
 * 		2) ����
 * 		3) �ڷΰ���
 * 2. �����Ƿ�
 * 		1) �����
 * 		2) ġ��
 * 		3) �ڷΰ���
 * 3. ����
 */
//12:28 - 12:36

package day_05;

import java.util.Scanner;

public class step1_10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1.�����Ƿ�");
			System.out.println("2.�����Ƿ�");
			System.out.println("3.����");
			
			System.out.print("�޴� ���� : ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("1)Ƽ����");
				System.out.println("2)����");
				System.out.println("3)�ڷΰ���");
				
				System.out.println("�������ּ���");
				int choice = sc.nextInt();
				
				if(choice == 3)
				{
					System.out.println("1.�����Ƿ�");
					System.out.println("2.�����Ƿ�");
					System.out.println("3.����");
				}
				else if(choice == 2)
				{
					System.out.println("������ ������ 1000�� �Դϴ�");
				}
				else if(choice == 1)
				{
					System.out.println("Ƽ������ ������ 2000�� �Դϴ�");
				}
			}
			else if(select == 2) {
				System.out.println("1)Ƽ����");
				System.out.println("2)����");
				System.out.println("3)�ڷΰ���");
				
				System.out.println("�������ּ���");
				int choice = sc.nextInt();
				
				if(choice == 3)
				{
					System.out.println("1.�����Ƿ�");
					System.out.println("2.�����Ƿ�");
					System.out.println("3.����");
				}
				else if(choice == 2)
				{
					System.out.println("������ ������ 1000�� �Դϴ�");
				}
				else if(choice == 1)
				{
					System.out.println("Ƽ������ ������ 2000�� �Դϴ�");
				}
			}
			else if(select == 3) {
				System.out.println("���α׷� ����");
				break;
			}
		}
		System.out.println("");
	}
}
