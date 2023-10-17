package class04;

public class DogTest {
	public static void main(String[] args) {
		Dog dog = new Dog(); // 기본생성자
		Dog dog2 = new Dog("강아지");
		System.out.println(dog2.name); // 강아지
	}
}
