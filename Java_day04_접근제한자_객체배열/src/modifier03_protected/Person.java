package modifier03_protected;

public class Person {
	// 같은 패키지 가능 다른 패키지일 때 상속 받으면 가능
	protected String name;
	protected int age;

	public void info() {
		System.out.printf("이름: %s, 나이: %d\n", name, age);
	}
}
