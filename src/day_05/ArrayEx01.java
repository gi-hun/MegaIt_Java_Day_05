package day_05;

/*
 * [1] 변수 : 값 한개 저장하는 기술
 * [2] 배열 : (같은 종류의)값 여러개 저장하는 기술
 * [3] 클래스 : (여러 종류의)값 여러개 저장하는 기술
 */

public class ArrayEx01 {
	public static void main(String[] args) {
		
		int num = 10;
		System.out.println(num);
		
		//          힙 메모리에(new) 정수형 값 3개를 저장할 수 있는 방을 만들어줘!
		int[] arr = new int[3];
		// int arr[] = new int[3];
		System.out.println(arr);			// [I@7852e922
		
		// 힙에 생성되는 메모리는
		// 값이 자동 초기화
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
//		int[] scores = new int[3];
//		scores[0] = 10;
//		scores[1] = 20;
//		scores[2] = 30;
		
		// 배열의 축약형
		int[] scores = {10, 20, 30};
		
		
	}
}
