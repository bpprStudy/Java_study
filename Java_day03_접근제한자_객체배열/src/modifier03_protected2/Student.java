package modifier03_protected2;

import modifier03_protected.Person;

public class Student extends Person{
	public static void main(String[] args) {
		Student s = new Student();
		// 상속을 받음
		// 다른 패키지이지만 protected 특성상 접근이 가능하다
		s.age = 10;
		s.name = "Yang";
	}
}
