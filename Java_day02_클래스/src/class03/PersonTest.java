package class03;

public class PersonTest {
	public static void main(String[] args) {
		// Person이라고 하는 클래스를 정의해놓았다
		Person t = new Person();
		t.info();

		Person p = new Person(); // 인스턴스 생성

		p.age = 10;
		p.hobby = "유튜브보기";
		p.name = "Yang";

		p.info();

		Person p2 = new Person();

		// 묵시적인 형변환 가능
		p2.study((byte) 10);
		p2.study((short) 10);
		p2.study(10);
		p2.study(10L); // 메서드 오버로딩해서 문제 안됨
		// 문제 발생
//		p2.study(10.0f);
//		p2.study(10.0);

	}
}
