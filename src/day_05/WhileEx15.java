/*
 * # �����л�
 * 1. 10ȸ �ݺ��� �Ѵ�.
 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
 * 3. ������ 60�� �̻��̸� �հݻ��̴�.
 * ---------------------------------------
 * . ������(10��)�� ������ ����� ����Ѵ�.
 * . �հ��� ���� ����Ѵ�.
 * . 1�� �л��� ��ȣ�� ������ ����Ѵ�.
 */
//12:13-12:24

package day_05;

import java.util.Scanner;
import java.util.Random;

public class WhileEx15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int i = 0;     //10�� �ݺ���Ű�� ���� ����
		int num = 1;     //����
		int maxnum = 0;     //�ִ�
		int total = 0;     //����
		int avg = 0;     //���
		int count = 0;     //�л� ����
		
		while(i < 10)
		{
			int score = ran.nextInt(100) + 1;     //1~100 ���� ���� ���� ����
			
			System.out.println(num+".�л� ����:" + score);
			
			if(score >= 60)
			{
				System.out.println("�հ�");
			}
			else
			{
				System.out.println("���հ�");
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
		System.out.println("�л����� ���� ���" + avg);
		System.out.println("1�� �л��� ����" + maxnum);
		System.out.println("1�� �л��� ����" + count);
	}
}
