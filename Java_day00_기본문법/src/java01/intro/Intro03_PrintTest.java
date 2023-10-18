package java01.intro;

public class Intro03_PrintTest {
	public static void main(String[] args) {
		// print
		System.out.print("Hello World!");
		// \n : 줄바꿈
		System.out.print("Hello World!\n");
		// println
		System.out.println("Hello World!");
//		
		System.out.println("\\");
		System.out.println("\"");
//		
		System.out.printf("%d \n", 10); // 정수 (10진수)
		System.out.printf("%o \n", 10); // 정수 (8진수)
		System.out.printf("%X \n", 10); // 정수 (16진수)
		System.out.printf("%x \n", 10); // 정수 (16진수)
//		
		System.out.printf("%4d\n", 10); // 4칸을 확보한 뒤 오른쪽부터 차지
		System.out.printf("%-4d\n", 10); // 4칸을 확보한 뒤 왼쪽부터 차지
		System.out.printf("%04d\n", 10); // 4칸을 확보한 뒤 오른쪽부터 차지 (빈칸은 0으로 채움)
//		
		System.out.printf("%f\n", 10.1); // 실수
		System.out.printf("%.2f\n", 10.105); // 실수 (소수점 둘째자리까지)
//		
		System.out.printf("%s\n", "문자열");
		System.out.printf("%c\n", 'k'); // 문자 하나만

	}
}
