package modifier06_singleton;

// Person �̶�� �ϴ� Ŭ������ �̱��� ������ �����ϰ� �ʹ�
public class Person {
	// 2. ������� �־�� �Ѵ�
	// 5. static �ؾ���
	private static Person instance = new Person();
//	private String name = "Yang";

	// 1. �ܺο��� �������� ���ϰ� ����
	// - �⺻ �����ڸ� �ۼ��ϰ� ���������ڸ� private�ϰ� �����
	private Person() {
	}

	// 3. �ܺο��� ���� instance�� ������ �� �� �ְ� ���ֱ�
	// 4. �ܺο��� ������ ���� ���� �޸𸮿� �̸� �÷����� static
	public static Person getInstance() {
		// 6���� ��� ���� �ۼ� ����
//		if(instance == null)
//			instance = new Person();
		return instance;
	}
}
