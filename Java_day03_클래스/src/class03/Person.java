package class03;

public class Person {
	static int personCount; // Ŭ���� ����
	String name; // �ν��Ͻ� ����
	int age;
	String hobby;

	public void info() {
		System.out.println("���� �̸��� " + name + "�Դϴ�.");
		System.out.println("���̴� " + age + "��, ��̴� " + hobby + "�Դϴ�.");
	}

	public void study(int time) {
		// int time = ��;
		System.out.println(time + "��ŭ ���� ����");
	}

	// �޼��� �����ε�
	// �Ű������� Ÿ���� �ٸ��ų� ������ �ٸ��� �Ͽ� ������
	public void study(int time, int min) {
		// int time = ��;
		System.out.println(time + "��ŭ ���� ����");
	}

	public void study(long time) {
		System.out.println(time + "��ŭ ���� ����");
	}

}
