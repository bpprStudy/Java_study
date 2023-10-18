
public class Array08_2차원배열_실습 {
	public static void main(String[] args) {
		int[][] grid = { { 2, 3, 1, 4, 7 }, { 8, 13, 3, 33, 1 }, { 7, 4, 5, 80, 12 }, { 17, 9, 11, 5, 4 },
				{ 4, 5, 91, 37, 7 } };

		// 전체를 순회하면서 3의 배수의 개수와 총합을 구하기
		int cnt = 0;
		int total = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] % 3 == 0) {
					cnt++;
					total += grid[i][j];
				}
			}
		}
		System.out.printf("개수: %d, 총합: %d%n", cnt, total);

		int count = 0;
		int sum = 0;
		for (int[] row : grid) {
			for (int num : row) {
				if (num % 3 == 0) {
					count++;
					sum += num;
				}
			}
		}
		System.out.printf("개수: %d, 총합: %d%n", count, sum);
	}
}
