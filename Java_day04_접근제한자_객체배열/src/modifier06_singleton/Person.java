package modifier06_singleton;

// Person 이라고 하는 클래스를 싱글턴 패턴을 적용하고 싶다
public class Person {
	// 2. 가지고는 있어야 한다
	// 5. static 해야함
	private static Person instance = new Person();
//	private String name = "Yang";

	// 1. 외부에서 생성하지 못하게 막기
	// - 기본 생성자를 작성하고 접근제한자를 private하게 만들기
	private Person() {
	}

	// 3. 외부에서 나의 instance를 가져다 쓸 수 있게 해주기
	// 4. 외부에서 가져다 쓰기 위해 메모리에 미리 올려놓기 static
	public static Person getInstance() {
		// 6번줄 대신 여기 작성 가능
//		if(instance == null)
//			instance = new Person();
		return instance;
	}
}
