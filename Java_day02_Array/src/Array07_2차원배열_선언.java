
public class Array07_2차원배열_선언 {
	public static void main(String[] args) {
		int[][] arr1; // 이 방식 권장
		int arr2[][];
		int[] arr3[];

		// 생성하는 방법
		int[][] arr4 = new int[5][5]; // 길이를 넣음

		int[][] arr5 = new int[5][]; // 행의 길이만 넣음
		System.out.println(arr5[1]); // null
	}
}
