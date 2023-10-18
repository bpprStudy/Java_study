package class03;

public class Person {
	static int personCount; // 클래스 변수
	String name; // 인스턴스 변수
	int age;
	String hobby;

	public void info() {
		System.out.println("나의 이름은 " + name + "입니다.");
		System.out.println("나이는 " + age + "세, 취미는 " + hobby + "입니다.");
	}

	public void study(int time) {
		// int time = 값;
		System.out.println(time + "만큼 공부 했음");
	}

	// 메서드 오버로딩
	// 매개변수의 타입이 다르거나 개수를 다르게 하여 정의함
	public void study(int time, int min) {
		// int time = 값;
		System.out.println(time + "만큼 공부 했음");
	}

	public void study(long time) {
		System.out.println(time + "만큼 공부 했음");
	}

}
