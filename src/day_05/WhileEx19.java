/*
 * # �ݺ��� for
 * 1. �ݺ����� ���� 3����
 * 1) �ʱ��
 * 2) ���ǽ�
 * 3) ������
 * 2. for���� ����
 * for(�ʱ��;���ǽ�;������){
 * 		���ǽ��� ���� ���� ������ ����;
 * }
 * 3. for���� �������
 * �ʱ�� �� ���ǽ� �� ���๮ �� ������ �� ���ǽ� �� ���๮ �� ������ ...
 */

		// ���� 1) 1���� 5���� ���
				// ���� 1) 1, 2, 3, 4, 5

				// ���� 2) 1���� 10���� �ݺ���, 5~9���� ���
				// ���� 2) 5, 6, 7, 8, 9

				// ���� 3) 1���� 10���� �ݺ��� 6~3���� ���
				// ���� 3) 6, 5, 4, 3

				// ���� 4) 1���� 10���� �ݺ��� 3�̸� 7�̻� ���
				// ���� 4) 1, 2, 7, 8, 9, 10
//02:04-02:10

package day_05;

public class WhileEx19 {
	public static void main(String[] args) {
		
		for(int i=1; i<6; i++)
		{
			System.out.println(i);
		}
		System.out.println("");
		
		for(int i=1; i<=10; i++)
		{
			if(i>4 && i<10)
			{
				System.out.println(i);
			}
		}
		System.out.println("");
		
		for(int i=10; i>0; i--)
		{
			if(i<7 && i>=3)
				System.out.println(i);
		}
		System.out.println("");
		
		for(int i=1; i<11; i++)
		{
			if(i<3 || i>=7)
			{
				System.out.println(i);
			}
		}
	}
}
