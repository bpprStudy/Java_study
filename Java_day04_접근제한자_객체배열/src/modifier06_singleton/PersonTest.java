package modifier06_singleton;

public class PersonTest {
	public static void main(String[] args) {
//		Person p = new Person(); // �⺻ �����ڰ� private�̱� ������ �ȵ�
		Person p = Person.getInstance();
		
		Person p2 = Person.getInstance();
	}
}
