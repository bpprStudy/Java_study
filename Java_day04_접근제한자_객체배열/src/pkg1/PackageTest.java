package pkg1;

import pkg1.pkg2.Person;

public class PackageTest {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.pkg);
		
		
		// 내부적으로 같은 이름의 클래스 이지만 패키지는 다른 경우
		// 풀 패키지명으로 자료형을 적어주면 된다.
		pkg1.Person p1 = new pkg1.Person();
		pkg1.pkg2.Person p2 = new pkg1.pkg2.Person();
		pkg1.pkg2.pkg3.Person p3 = new pkg1.pkg2.pkg3.Person();
		
		System.out.println(p1.pkg);
		System.out.println(p2.pkg);
		System.out.println(p3.pkg);
		
	}
}
