/*
 * # īī�� �ý�
 * 1. �մ��� �¿� ���������� �̵��ϴ� �����̴�.
 * 2. -10~10 ������ ���� ���� 2���� ������ �������� �����Ѵ�.
 * 3. �޴��� �Ʒ��� ����.
 * 		1) �ӵ����� : 1~3������ ����
 * 		2) ���⼳�� : ��(1)��(2)��(3)��(4)
 * 		3) �̵��ϱ� : ������ �������� ������ �ӵ���ŭ �̵�
 * 4. �Ÿ� 2ĭ �� 50���� �߰��Ǿ� ��ݵ� ����Ѵ�.
 * ��) 1(50) 2(50) 3(100) 4(100) ...
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
		
		int x=0;		//���� ��ġ
		int y=0;		//���� ��ġ
		int dir=0;		//����
		int speed=0;	//�ӵ�
		int total=0;		//�̵�
		int fee=0;
		
		while(true)
		{
			System.out.println("= īī�� �ý� =");
			System.out.println("������: "+ dst_x +"," + dst_y);
			System.out.println("����ġ: "+ x +"," + y);
			System.out.println("��  ��:"+dir);
			System.out.println("�� ��:"+speed);
			System.out.println("=================");
			
			System.out.println("1.���� ����");
			System.out.println("2.�ӵ� ����");
			System.out.println("3.�̵� �ϱ�");
			System.out.println("�޴� ���� : ");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				System.out.println("���� �Է�[��1 ��2 ��3 ��4]");
				dir = sc.nextInt();
			}
			else if(select == 2)
			{
				System.out.println("�ӵ� �Է�[1~3]");
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
				
				System.out.println("�ýú�:" + fee);
				break;
			}
		}
		
		
	}
}
