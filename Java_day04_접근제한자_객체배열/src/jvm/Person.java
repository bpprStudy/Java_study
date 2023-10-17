package jvm;

public class Person {
	// 클래스 변수
	// 모든 인스턴스가 공유
	static int pCount; // 사람의 수를 세는 변수 선언

	// 인스턴스 변수
	// 인스턴스마다 메모리를 할당한다 (힙영역에 생성)
	String name;
	String hobby;
	int age;
	
	// non-static 영역
	public void count() {
		System.out.println(pCount);
	}
	
	// static 영역
//	public static void info() {
//		System.out.println(name); // name은 non-static
//	}
}
