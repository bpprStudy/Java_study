package modifier01_private;

// class는 public 아니면 default
public class Person {
	// private : 내 클래스 내에서만 사용할 수 있는 제한자
	private String name;
	private int age;
	
	public void info() {
		System.out.printf("이름: %s, 나이: %d\n", name, age);
	}
}
