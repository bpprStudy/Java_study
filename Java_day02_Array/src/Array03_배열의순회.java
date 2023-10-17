import java.util.Arrays;

public class Array03_배열의순회 {
	public static void main(String[] args) {
		int[] nums = { 45, 9, 3, 7, 16, 25 };

		// 반복문을 통해 순회
//		for(int i = 0; i<nums.length; i++) {
//			System.out.println(nums[i]);
//		}

		// for-each
		// 가독성이 향상된 for문
//		for(자료형 변수명 : 반복할수있는것) {
//		
//		}

//		for(int n : nums) {
//			System.out.println(n);
//		}

		// 읽기만 가능해서 의미 없음
		// 이 반복문 안에서만 값이 변함
//		for (int x : nums) {
////			x = x * 2;
//			x *= 2;
//		}
//		
//		for(int x : nums) {
//			System.out.println(x);
//		}

		// 이렇게 하면 값이 변함
		for (int i = 0; i < nums.length; i++) {
			nums[i] *= 2;
		}

		for (int x : nums) {
			System.out.println(x);
		}

		// 배열 안의 값이 궁금할 때 사용하면 그냥 바로 볼 수 있음
		System.out.println(Arrays.toString(nums));

	}
}
