package class04;

public class Dog {
	String name;

	// 기본 생성자라고 하는 것은 아무 매개변수가 없는
	// 클래스명과 동일하게 작성 / 매개변수 없음 / 반환 타입 없음
	// 기본 생성자는 습관처럼 추가하자
	public Dog() {
		System.out.println("기본생성자");
		// 작성하지 않아도 컴파일러가 알아서 집어넣음
	}

	public Dog(String name) {
		this.name = name;
	}
}
 