package class02;

import java.util.Random;

public class FuntionTest3 {
	public static void main(String[] args) {
		boolean homework;
		
		System.out.println("��ħ�� �Ͼ��.");
		�̵�("������", "���߱���");
		homework = ����();
		�̵�("��", "������");
		if (homework) {			
			System.out.println("������ �ذ��Ѵ�.");
		}
		System.out.println("�ܴ�.");
	}
	
	// ������ �� ������ ���� ���� ���� ����
	public static boolean ����() {
		System.out.println("���������� ��´�.");
		System.out.println("������ �Դ´�.");
		System.out.println("���ļ����� ��´�.");
		
		// ���� ���� �߻�
		Random random = new Random();
		return random.nextBoolean(); // �����ϰ� True, False ��ȯ
	}
	
	public static void �̵�(String ���, String Ż��) {
		System.out.println(���+"(��)�� "+Ż��+"(��)�� �̿��Ͽ� �̵��Ѵ�.");
	}
	
	
	
}
