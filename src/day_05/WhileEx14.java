/*
 * # �ִ밪 ���ϱ�[2�ܰ�]
 * 1. 3ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
 * 2. �Է¹��� 3���� ���� �� ���� ū ���� ����Ѵ�.
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
			System.out.println("���ڸ� �Է��Ͽ���");
			int  num = sc.nextInt();
			
			if(maxnum < num)
			{
				maxnum = num;
			}
			i++;
		}
		System.out.println("�ִ��� " + maxnum + "�̴�.");
	}
}
