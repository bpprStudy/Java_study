package java03.operator;

public class Op04_�������� {
	public static void main(String[] args) {
		// ������ ����Ͽ� ���� ����
		int a = 10;
		int b = 20;

		System.out.println(a > 5 && b > 5); // true
		System.out.println(a > 5 && b < 5); // false
		System.out.println(a < 5 && b > 5); // false
		System.out.println(a < 5 && b < 5); // false

		System.out.println(a > 5 || b > 5); // true
		System.out.println(a > 5 || b < 5); // true
		System.out.println(a < 5 || b > 5); // true
		System.out.println(a < 5 || b < 5); // false

		System.out.println(!(a < 5 || b < 5)); // true

	}
}
