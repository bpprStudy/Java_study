package java01.intro;

public class Intro03_PrintTest {
	public static void main(String[] args) {
		// print
		System.out.print("Hello World!");
		// \n : �ٹٲ�
		System.out.print("Hello World!\n");
		// println
		System.out.println("Hello World!");
//		
		System.out.println("\\");
		System.out.println("\"");
//		
		System.out.printf("%d \n", 10); // ���� (10����)
		System.out.printf("%o \n", 10); // ���� (8����)
		System.out.printf("%X \n", 10); // ���� (16����)
		System.out.printf("%x \n", 10); // ���� (16����)
//		
		System.out.printf("%4d\n", 10); // 4ĭ�� Ȯ���� �� �����ʺ��� ����
		System.out.printf("%-4d\n", 10); // 4ĭ�� Ȯ���� �� ���ʺ��� ����
		System.out.printf("%04d\n", 10); // 4ĭ�� Ȯ���� �� �����ʺ��� ���� (��ĭ�� 0���� ä��)
//		
		System.out.printf("%f\n", 10.1); // �Ǽ�
		System.out.printf("%.2f\n", 10.105); // �Ǽ� (�Ҽ��� ��°�ڸ�����)
//		
		System.out.printf("%s\n", "���ڿ�");
		System.out.printf("%c\n", 'k'); // ���� �ϳ���

	}
}
