package pkg1;

import pkg1.pkg2.Person;

public class PackageTest {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.pkg);
		
		
		// ���������� ���� �̸��� Ŭ���� ������ ��Ű���� �ٸ� ���
		// Ǯ ��Ű�������� �ڷ����� �����ָ� �ȴ�.
		pkg1.Person p1 = new pkg1.Person();
		pkg1.pkg2.Person p2 = new pkg1.pkg2.Person();
		pkg1.pkg2.pkg3.Person p3 = new pkg1.pkg2.pkg3.Person();
		
		System.out.println(p1.pkg);
		System.out.println(p2.pkg);
		System.out.println(p3.pkg);
		
	}
}
