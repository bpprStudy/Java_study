package jvm;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Yang";

		p1.pCount = 10;
		System.out.println(p1.pCount); // 오류는 나지않지만 경고

		System.out.println(Person.pCount);

		Person p2 = new Person();
		System.out.println(p2.pCount);
	}
}
