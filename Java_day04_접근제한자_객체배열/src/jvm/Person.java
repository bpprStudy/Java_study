package jvm;

public class Person {
	// Ŭ���� ����
	// ��� �ν��Ͻ��� ����
	static int pCount; // ����� ���� ���� ���� ����

	// �ν��Ͻ� ����
	// �ν��Ͻ����� �޸𸮸� �Ҵ��Ѵ� (�������� ����)
	String name;
	String hobby;
	int age;
	
	// non-static ����
	public void count() {
		System.out.println(pCount);
	}
	
	// static ����
//	public static void info() {
//		System.out.println(name); // name�� non-static
//	}
}
