package modifier01_private;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		// Person / PersonTest 다른 클래스 파일
//		p. age name -> private이므로 접근 불가
		p.info();	// public해서 접근 가능
	}
}
