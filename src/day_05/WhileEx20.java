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
			System.out.println("1.�ܹ���");
			System.out.println("2.�ݶ�");
			System.out.println("3.����");
			
			int sel = sc.nextInt();
			
			if(sel != 1 && sel != 2 && sel !=3)
			{
				continue;		//1�� 2�� 3�� ���þ����� �� ���� �˻� �ٽ�
			}
			
			if(sel == 1)
			{
				System.out.println("�ܹ��Ŵ� 5900���Դϴ�.");
			}
			else if(sel == 2)
			{
				System.out.println("�ݶ�� 1900���Դϴ�.");
			}
			else if(sel == 3)
			{
				System.out.println("���� 3900���Դϴ�.");
			}
			
		}
	}
}
