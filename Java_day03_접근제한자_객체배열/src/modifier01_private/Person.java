package modifier01_private;

// class�� public �ƴϸ� default
public class Person {
	// private : �� Ŭ���� �������� ����� �� �ִ� ������
	private String name;
	private int age;
	
	public void info() {
		System.out.printf("�̸�: %s, ����: %d\n", name, age);
	}
}
