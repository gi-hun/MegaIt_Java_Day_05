package day_05;

/*
 * [1] ���� : �� �Ѱ� �����ϴ� ���
 * [2] �迭 : (���� ������)�� ������ �����ϴ� ���
 * [3] Ŭ���� : (���� ������)�� ������ �����ϴ� ���
 */

public class ArrayEx01 {
	public static void main(String[] args) {
		
		int num = 10;
		System.out.println(num);
		
		//          �� �޸𸮿�(new) ������ �� 3���� ������ �� �ִ� ���� �������!
		int[] arr = new int[3];
		// int arr[] = new int[3];
		System.out.println(arr);			// [I@7852e922
		
		// ���� �����Ǵ� �޸𸮴�
		// ���� �ڵ� �ʱ�ȭ
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
//		int[] scores = new int[3];
//		scores[0] = 10;
//		scores[1] = 20;
//		scores[2] = 30;
		
		// �迭�� �����
		int[] scores = {10, 20, 30};
		
		
	}
}
