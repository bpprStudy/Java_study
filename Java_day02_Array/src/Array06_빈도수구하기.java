import java.util.Arrays;

public class Array06_�󵵼����ϱ� {
	public static void main(String[] args) {
		int[] intArray = { 3, 7, 2, 5, 7, 7, 9, 2, 8, 1, 1, 5, 3 };

		int[] count = new int[10];
		for (int num : intArray) {
			count[num]++;
		}
		System.out.println(Arrays.toString(count));
	}
}
