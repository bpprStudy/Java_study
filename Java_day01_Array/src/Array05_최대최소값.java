
public class Array05_최대최소값 {
	public static void main(String[] args) {
		int[] nums = { 45, 9, 3, 5, 24, 36 };

		int min = nums[0];
		int max = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (min > nums[i]) {
				min = nums[i];
			}
			if (max < nums[i]) {
				max = nums[i];
			}
		}

		System.out.println(min);
		System.out.println(max);

		int min2 = nums[0];
		int max2 = nums[0];

		for (int num : nums) {
			if (num > max2) {
				max2 = num;
			}
			if (num < min2) {
				min2 = num;
			}
		}
		System.out.printf("min: %d, max: %d%n", min2, max2);

		int min3 = Integer.MAX_VALUE;
		int max3 = Integer.MIN_VALUE;

		for (int num : nums) {
			min3 = Math.min(min3, num);
			max3 = Math.max(max3, num);
		}
		System.out.printf("min: %d, max: %d%n", min3, max3);
	}
}
