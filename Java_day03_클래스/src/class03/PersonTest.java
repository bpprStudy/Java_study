package class03;

public class PersonTest {
	public static void main(String[] args) {
		// Person�̶�� �ϴ� Ŭ������ �����س��Ҵ�
		Person t = new Person();
		t.info();

		Person p = new Person(); // �ν��Ͻ� ����

		p.age = 10;
		p.hobby = "��Ʃ�꺸��";
		p.name = "Yang";

		p.info();

		Person p2 = new Person();

		// �������� ����ȯ ����
		p2.study((byte) 10);
		p2.study((short) 10);
		p2.study(10);
		p2.study(10L); // �޼��� �����ε��ؼ� ���� �ȵ�
		// ���� �߻�
//		p2.study(10.0f);
//		p2.study(10.0);

	}
}
