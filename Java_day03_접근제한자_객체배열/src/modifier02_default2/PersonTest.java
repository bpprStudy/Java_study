package modifier02_default2;

import modifier02_default.Person;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		// 다른 클래스이기도 하고 다른 패키지임
		// 다른 패키지이므로 default 속성 접근 불가능
		p.info();
	}
}
